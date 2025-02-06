# MuhammadRidhoAbdawi-2110010175-TB
 Aplikasi Inventaris Aset

## Deskripsi
Aplikasi Inventaris Aset ini dirancang untuk mengelola data aset, pengguna, dan transaksi aset dalam suatu organisasi. Aplikasi ini memiliki fitur CRUD (Create, Read, Update, Delete) untuk setiap entitas dan dilengkapi dengan fitur pencarian serta pencetakan laporan.

---

## Fitur Utama
1. **CRUD (Create, Read, Update, Delete)**
   - Mengelola data aset
   - Mengelola data pengguna
   - Mengelola data transaksi aset
2. **Pencarian Data**
   - Fitur pencarian cepat berdasarkan nama atau ID
3. **Cetak Laporan**
   - Mencetak daftar aset, pengguna, dan transaksi
4. **Manajemen Transaksi**
   - Mencatat transaksi masuk dan keluar aset berdasarkan pengguna

---

## Struktur Form
Aplikasi ini memiliki tiga form utama:

1. **Form Aset**
   - Menampilkan daftar aset
   - Menambah, mengedit, dan menghapus aset
   - Mencari aset berdasarkan nama
   - Gambar: `screenshot/faset.png`

2. **Form Pengguna**
   - Menampilkan daftar pengguna
   - Menambah, mengedit, dan menghapus pengguna
   - Mencari pengguna berdasarkan nama
   - Gambar: `screenshot/fpengguna.png`

3. **Form Transaksi**
   - Mencatat transaksi masuk dan keluar aset
   - Menampilkan riwayat transaksi
   - Mencetak laporan transaksi
   - Gambar: `screenshot/ftransaksi.png`

---

## Tampilan Laporan
1. **Laporan Aset** (`screenshot/laset.png`)
2. **Laporan Pengguna** (`screenshot/lpengguna.png`)
3. **Laporan Transaksi** (`screenshot/ltransaksi.png`)

---
## Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java (Swing untuk UI)
- **Database**: MySQL
- **Framework Database**: JDBC
- **Library Tambahan**: iText (untuk PDF), MySQL Connector

---

## Cara Menjalankan
1. **Import Database**
   - Buat database baru, misalnya `db_inventaris_aset`
   - Jalankan skrip SQL untuk membuat tabel dan mengisi data dummy

2. **Konfigurasi Koneksi Database**
   - Pastikan aplikasi terhubung ke database dengan mengatur koneksi di `KoneksiDB.java`

3. **Jalankan Aplikasi**
   - Buka proyek di NetBeans atau IntelliJ
   - Jalankan aplikasi dan gunakan fitur CRUD serta pencarian

---

## Kontak & Kontributor
Nama: Muhammad Ridho Abdawi
Email: ashakun20@Gmail.com  




