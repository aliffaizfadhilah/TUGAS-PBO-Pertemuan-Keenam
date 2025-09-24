# TUGAS-PBO-Pertemuan-Keenam
Koneksi JFrame Form dan JDialog  Netbeans dengan PostgreSQL Java di Netbeans.
# Dekripsi Project 
Petville adalah aplikasi sederhana berbasis Java Swing (JFrame & JDialog) yang terhubung dengan PostgreSQL Database.
Aplikasi ini dirancang untuk melakukan operasi CRUD (Create, Read, Update, Delete) terhadap data hewan peliharaan. JFrame Form digunakan sebagai jendela utama untuk menampilkan data. JDialog (Insert, Update, Delete) digunakan sebagai form tambahan untuk memasukkan, memperbarui, dan menghapus data. JDBC (Java Database Connectivity) digunakan sebagai penghubung aplikasi dengan PostgreSQL.
# JDialog Java
JDialog adalah salah satu komponen GUI di Java yang berfungsi sebagai jendela dialog tambahan di luar jendela utama (biasanya JFrame). Komponen ini digunakan untuk menampilkan pesan, meminta konfirmasi, atau menerima input dari pengguna dalam bentuk jendela kecil yang lebih fokus. Sebuah JDialog dapat dibuat bersifat modal, artinya ketika dialog ditampilkan, pengguna tidak bisa berinteraksi dengan jendela lain sebelum dialog tersebut ditutup, atau non-modal yang memungkinkan pengguna tetap berinteraksi dengan jendela utama meskipun dialog masih terbuka. JDialog juga bisa dikustomisasi, baik dari segi ukuran, tata letak, maupun komponen yang ditambahkan ke dalamnya. Dengan karakteristik tersebut, JDialog menjadi elemen penting untuk mengelola interaksi tambahan yang tidak ingin bercampur langsung dengan alur utama dalam JFrame. 
# Konektivitas Antara JFrame Form dengan JDialog
Dalam Java, JFrame biasanya digunakan sebagai jendela utama (main window) dari sebuah aplikasi berbasis GUI, sedangkan JDialog dipakai sebagai jendela tambahan yang bersifat dialog, misalnya untuk menampilkan pesan, konfirmasi, atau form input tertentu. Konektivitas antara keduanya terjalin ketika sebuah JDialog dipanggil dari JFrame dengan cara mengirimkan objek induk (parent) berupa new JDialog(JFrame parent, boolean modal). Parameter parent menghubungkan dialog ke jendela utama, sementara parameter modal menentukan apakah dialog tersebut akan mengunci interaksi dengan JFrame sampai dialog ditutup atau tidak. Dengan hubungan ini, JDialog akan muncul di atas JFrame, mengikuti posisi dan lifecycle JFrame, sehingga pengguna merasakan alur aplikasi yang terstruktur: JFrame menjadi pusat aktivitas utama, sedangkan JDialog digunakan untuk interaksi khusus yang bersifat sementara.
# Langkah - langkah
1. Buat database baru, misalnya petville_db dan buat tabel hewan
2. Konfigurasi Koneksi Database buka file Koneksi.java dan sesuaikan DB_URL, USER, dan PASS sesuai konfigurasi PostgreSQL-mu.
3. Tambahkan JDBC Driver ke Proyek. Di NetBeans, klik kanan pada Libraries > Add Library > PostgreSQL JDBC Driver.
4. Jalankan Program. Klik kanan Petville.java > Run File. Aplikasi akan terbuka dengan form utama.
5. Menggunakan JDialog
- InsertDialog : Klik tombol Insert di JFrame utama. Akan muncul jendela JDialog untuk menambahkan data. Isi form (Nama, Jenis, Harga) → klik Save. Data otomatis masuk ke database dan tampil di tabel.
- UpdateDialog : Pilih data di tabel → klik tombol Update. Akan muncul jendela JDialog dengan data yang dipilih. Ubah field yang diinginkan → klik Update. Data di database akan diperbarui, tabel di JFrame ikut berubah.
- DeleteDialog : Pilih data di tabel → klik tombol Delete. Akan muncul jendela konfirmasi. Klik Yes/Delete → data akan dihapus dari database dan tabel.
