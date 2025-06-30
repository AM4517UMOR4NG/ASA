package DayOnerelearnjava;
/*
 * File: JavaExecutionFlow.java
 *
 * Penjelasan Komprehensif Alur Eksekusi Java
 * ---------------------------------------------------------
 * Bagian A: Penulisan dan Kompilasi
 * 1. Penulisan kode sumber (.java)
 *    - Developer menulis file berisi satu atau beberapa kelas Java.
 *    - Setiap file dinamai sesuai kelas publik di dalamnya.
 * 2. Kompilasi dengan javac
 *    - javac melakukan:
 *      a) Lexical Analysis: Memecah kode menjadi token.
 *      b) Syntax Analysis (Parsing): Membangun Abstract Syntax Tree (AST).
 *      c) Semantic Analysis: Cek tipe data, referensi.
 *      d) Bytecode Generation: Menerjemahkan AST menjadi bytecode .class.
 *    - Output: HelloWorld.class & JavaExecutionFlow.class
 *
 * Bagian B: Class Loader Subsystem
 * 1. Bootstrap ClassLoader (BCL)
 *    - Memuat kelas-kelas inti Java (rt.jar). Berbasis native code.
 * 2. Extension ClassLoader (ECL)
 *    - Memuat library di ${java.home}/lib/ext.
 * 3. Application ClassLoader (ACL)
 *    - Memuat kelas aplikasi dari classpath.
 *    - Parent delegation: ACL -> ECL -> BCL.
 *
 * Bagian C: Linking
 * 1. Verification
 *    - Memastikan bytecode valid dan tidak melanggar keamanan.
 * 2. Preparation
 *    - Mengalokasikan memori untuk variabel static, inisialisasi default.
 * 3. Resolution
 *    - Menggantikan symbolic references dengan direct references.
 *
 * Bagian D: Initialization
 *  - Menjalankan blok static initializer (static {...})
 *  - Menetapkan nilai eksplisit variabel static.
 *
 * Bagian E: Runtime Data Areas
 * 1. Method Area
 *    - Menyimpan struktur kelas, constant pool, bytecode.
 * 2. Heap
 *    - Tempat objek dan array dialokasikan.
 *    - Managed oleh Garbage Collector.
 * 3. JVM Stack per Thread
 *    - Setiap thread punya stack sendiri.
 *    - Frame: local variables, operand stack, frame data.
 * 4. PC Register per Thread
 *    - Menyimpan alamat instruksi bytecode berikutnya.
 * 5. Native Method Stack
 *    - Untuk eksekusi metode native (JNI).
 *
 * Bagian F: Execution Engine
 * 1. Interpreter
 *    - Membaca bytecode, mengeksekusi instruksi satu per satu.
 *    - Overhead tinggi karena interpretasi.
 * 2. Just-In-Time (JIT) Compiler
 *    - HotSpot memonitor metode sering dipanggil (hot methods).
 *    - Setelah threshold tercapai, kompile bytecode jadi native code.
 *    - Code Cache menyimpan hasil kompilasi.
 *    - Optimasi: method inlining, loop unrolling, escape analysis.
 *
 * Bagian G: Garbage Collection (GC)
 * 1. Generational GC
 *    - Young Generation (Eden + Survivor)
 *    - Old Generation (Tenured)
 *    - Garbage Collector: Stop-the-world untuk minor & major GC.
 * 2. Algoritma yang Umum:
 *    - Serial GC: Single-threaded, cocok heap kecil.
 *    - Parallel GC: Multi-threaded, throughput tinggi.
 *    - CMS (Concurrent Mark-Sweep): rendah paus latensi.
 *    - G1 GC: Pemrofilan heap menjadi region, paus rendah.
 *    - ZGC / Shenandoah: paus sangat pendek.
 *
 * Bagian H: Terminasi JVM
 *  - Setelah main() selesai, JVM menunggu non-daemon threads.
 *  - JVM shutdown sequence, memanggil shutdown hooks.
 *
 * Contoh Kode: HelloWorld + Demo Alur Eksekusi
 */

// ------- Kelas HelloWorld (Entry Point) -------
public class AlurDayOne {
    static {
        // Fase Initialization: static block berjalan sebelum main()
        System.out.println("[Static Init] HelloWorld diinisialisasi (inisialisasi static block).\n");
    }

    public static void main(String[] args) {
        // Fase Execution: JVM memanggil main
        System.out.println("=== Hello, World! ===\n");

        System.out.println("-- Memulai Demo Alur Eksekusi Java --\n");
        JavaExecutionFlow demo = new JavaExecutionFlow();
        demo.startDemo();
        System.out.println("-- Demo Selesai --");
    }
}

// ------- Kelas JavaExecutionFlow (Demo) -------
class JavaExecutionFlow {
    static {
        // Inisialisasi kelas sebelum constructor
        System.out.println("[Static Init] JavaExecutionFlow diinisialisasi.\n");
    }

    public JavaExecutionFlow() {
        // Object Creation: new di heap + jalankan constructor
        System.out.println("[Constructor] Objek JavaExecutionFlow dibuat di heap.\n");
    }

    public void startDemo() {
        // Menampilkan struktur runtime data areas
        showRuntimeAreas();

        // Menjalankan thread baru untuk demo stack per thread
        Thread worker = new Thread(this::threadTask, "WorkerThread");
        worker.start();

        // Loop berat untuk memicu JIT pada main thread
        computeIntensive("MainThread");

        // Meminta garbage collection sebagai hint
        System.out.println("[Demo] Memanggil System.gc() (hint ke GC).\n");
        System.gc();

        try {
            worker.join(); // Tunggu thread selesai
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void showRuntimeAreas() {
        System.out.println("[Runtime Areas] Menjelaskan runtime data areas:");
        System.out.println("- Method Area: Bytecode & metadata kelas");
        System.out.println("- Heap: Objek & array");
        System.out.println("- JVM Stack & PC Register per thread");
        System.out.println("- Native Method Stack untuk metode JNI\n");
    }

    private void threadTask() {
        System.out.println("[Thread " + Thread.currentThread().getName() + "] Memulai task (demo JVM Stack).\n");
        computeIntensive(Thread.currentThread().getName());
        System.out.println("[Thread " + Thread.currentThread().getName() + "] Selesai task.\n");
    }

    private void computeIntensive(String threadName) {
        System.out.println("[" + threadName + "] Loop komputasi untuk memicu JIT start.");
        for (int i = 0; i < 1_000_000; i++) {
            // Operasi float point, sering dioptimasi
            Math.sin(i);
        }
        System.out.println("[" + threadName + "] Loop komputasi selesai (hot method telah di-JIT).\n");
    }

    @Override
    protected void finalize() throws Throwable {
        // Deprecated di Java 9+, tetap sebagai ilustrasi
        System.out.println("[GC] finalize() dipanggil sebelum objek di-GC.\n");
        super.finalize();
    }
}

/*
 * Cara Pengujian:
 * 1. Simpan sebagai JavaExecutionFlow.java (sudah mencakup HelloWorld class).
 * 2. Kompilasi:   javac JavaExecutionFlow.java
 *    - Hasil: HelloWorld.class & JavaExecutionFlow.class
 * 3. Jalankan:    java HelloWorld
 *    - Output: menampilkan setiap fase dari penulisan hingga terminasi JVM.
 *
 * Catatan Tambahan:
 * - Untuk melihat bytecode: javap -c HelloWorld.class
 * - Untuk logging JIT & GC di HotSpot VM: tambahkan flag
 *   -XX:+PrintCompilation dan -XX:+PrintGCDetails
 */
