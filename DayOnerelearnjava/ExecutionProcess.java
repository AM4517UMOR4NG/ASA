package DayOnerelearnjava;

/*
 * 1. PENULISAN KODE SUMBER
 * - Kode Java ditulis dalam file dengan ekstensi .java (contoh: HelloWorld.java).
 * - Kode ini berisi kelas, metode, dan logika program dalam sintaks tingkat tinggi.
 * - File ini adalah kode sumber yang belum dapat dieksekusi langsung oleh komputer.
 */

public class ExecutionProcess {
    /*
     * 2. KOMPILASI KE BYTECODE
     * - Kode sumber (.java) dikompilasi oleh Java Compiler (javac), bagian dari JDK.
     * - javac memeriksa sintaks dan mengubah kode menjadi bytecode (.class).
     * - Bytecode adalah kode biner platform-independen yang dibaca oleh JVM.
     * - Contoh perintah: `javac HelloWorld.java` menghasilkan HelloWorld.class.
     */

    /*
     * 3. JAVA VIRTUAL MACHINE (JVM)
     * - JVM adalah mesin virtual yang mengeksekusi bytecode.
     * - JVM memungkinkan portabilitas: bytecode berjalan di platform apa pun dengan JVM.
     * - Komponen utama JVM:
     *   a. Class Loader: Memuat file .class ke memori.
     *   b. Bytecode Verifier: Memeriksa keamanan bytecode.
     *   c. Execution Engine: Menjalankan bytecode (Interpreter atau JIT Compiler).
     *   d. Garbage Collector: Mengelola memori otomatis.
     *   e. Runtime Data Areas: Heap, Stack, Method Area, dll.
     * - Perintah eksekusi: `java HelloWorld` (tanpa ekstensi .class).
     */

    /*
     * 4. CLASS LOADING
     * - Class Loader memuat file .class ke memori melalui tiga tahap:
     *   a. Loading: Membaca file .class.
     *   b. Linking:
     *      - Verification: Memastikan bytecode aman dan valid.
     *      - Preparation: Mengalokasikan memori untuk variabel statis.
     *      - Resolution: Mengganti referensi simbolik dengan referensi langsung.
     *   c. Initialization: Menjalankan kode inisialisasi statis.
     * - Jenis Class Loader: Bootstrap, Extension, dan Application Class Loader.
     */

    /*
     * 5. EKSEKUSI BYTECODE
     * - Execution Engine menjalankan bytecode dengan dua cara:
     *   a. Interpreter: Mengeksekusi bytecode baris demi baris (lambat tapi cepat dimulai).
     *   b. Just-In-Time (JIT) Compiler: Mengompilasi bytecode ke kode mesin asli (lebih cepat).
     * - HotSpot JVM menggabungkan interpretasi dan JIT untuk optimasi dinamis.
     * - Contoh: Panggilan System.out.println di bawah ini diterjemahkan ke kode mesin.
     */

    /*
     * 6. GARBAGE COLLECTION
     * - Garbage Collector (GC) mengelola memori otomatis di Heap.
     * - Heap dibagi menjadi Young Generation (Eden, Survivor) dan Old Generation.
     * - Proses GC: Mark (identifikasi objek aktif), Sweep (hapus objek tak aktif), Compact (opsional).
     * - Jenis GC: Serial, Parallel, G1, ZGC, Shenandoah.
     */

    /*
     * 7. INTERAKSI DENGAN SISTEM OPERASI
     * - JVM menggunakan Java Native Interface (JNI) untuk operasi tingkat rendah (I/O, jaringan).
     * - Contoh: System.out.println memanggil pustaka native untuk menampilkan teks di konsol.
     * - Native Method Stack digunakan untuk metode native.
     */

    /*
     * 8. KEAMANAN
     * - Bytecode Verifier memastikan kode aman.
     * - Security Manager mengontrol akses ke sumber daya sistem.
     * - Class Loader memisahkan kelas untuk mencegah konflik.
     */

    /*
     * 9. PENANGANAN EKSEPSI
     * - JVM menangani eksepsi (misalnya, NullPointerException) dengan mencari blok try-catch.
     * - Jika tidak ditangani, JVM menghentikan program dan menampilkan stack trace.
     */

    /*
     * 10. OPTIMASI
     * - HotSpot JVM melakukan optimasi seperti inlining, loop unrolling, dan escape analysis.
     * - Multithreading didukung dengan thread-specific stack dan shared heap.
     */

    public static void main(String[] args) {
        // Titik masuk program: metode main
        // JVM mulai eksekusi dari sini setelah class loading selesai
        System.out.println("Hello, World!");
    }

    /*
     * RINGKASAN PROSES:
     * 1. Tulis kode Java (.java).
     * 2. Kompilasi ke bytecode (.class) dengan javac.
     * 3. JVM memuat bytecode (Class Loader).
     * 4. Verifikasi bytecode untuk keamanan.
     * 5. Eksekusi bytecode (Interpreter/JIT Compiler).
     * 6. Garbage Collector mengelola memori.
     * 7. Interaksi dengan sistemreligion: Sistem Operasi via JNI.
     * 8. Output dihasilkan atau eksepsi ditangani.
     */
}