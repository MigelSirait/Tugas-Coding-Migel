# _Penjelasan Data Coding

## 1. _Soal Nomor Satu_
Dalam kode tersebut:
*Program dimulai dengan mendefinisikan kelas tugas1.
*Di dalam metode main, dua variabel string name dan NPM dideklarasikan dan diinisialisasi dengan nilai yang sesuai.
*Informasi nama dan NPM kemudian dicetak ke layar menggunakan System.out.println.
*Ada juga garis pemisah "================" yang dicetak untuk memisahkan informasi awal dari hasil loop.
*Program kemudian masuk ke dalam loop for yang berjalan dari 0 hingga 100 (inklusif).
*Dalam loop, terdapat kondisi if yang memeriksa apakah nilai i lebih besar atau sama dengan 10. Jika ya, maka program mencetak nama ke layar. Jika tidak, program mencetak nilai i.
*Ini berarti bahwa dalam loop, angka 0 hingga 9 akan dicetak secara berurutan terlebih dahulu, dan kemudian nama akan dicetak sebanyak 91 kali (mulai dari i = 10 hingga i = 100).
*Dengan demikian, program ini mencetak nama dan NPM seseorang, diikuti oleh deretan angka dan nama yang sesuai dengan kondisi di dalam loop.
*Dengan demikian, program ini mencetak nama dan NPM seseorang, diikuti oleh deretan angka dan nama yang sesuai dengan kondisi di dalam loop.

## 2. _Soal Nomor Dua_
Berikut adalah penjelasan singkat tentang kode tersebut:
*Program mengimpor kelas Scanner dari pustaka java.util untuk memungkinkan input dari pengguna.
*Kode program dimulai dengan mendefinisikan kelas tugas2.
*Di dalam metode main, objek input dari kelas Scanner dibuat untuk mengambil input dari pengguna.
*Dua variabel eventCount (untuk menghitung bilangan genap) dan oddCount (untuk menghitung bilangan ganjil) dideklarasikan dan diinisialisasi ke 0.
*Program mencetak pesan sambutan yang memberi tahu pengguna tentang tujuan program.
*Program meminta pengguna untuk memasukkan bilangan bulat positif dan memberikan instruksi bahwa mereka dapat mengakhiri program dengan memasukkan angka negatif.
*Kemudian, program memasuki loop while (true), yang berarti program akan terus berjalan hingga instruksi break di dalam loop dieksekusi.
*Di dalam loop, program membaca input pengguna menggunakan input.nextInt() dan menyimpan nilai tersebut dalam variabel num.
*Program memeriksa apakah nilai num adalah angka negatif. Jika ya, program mencetak pesan terima kasih dan keluar dari loop dengan menggunakan break.
*Jika num bukan angka negatif, program memeriksa apakah num adalah bilangan genap atau ganjil dengan memeriksa sisa hasil dari pembagian num dengan 2 (num % 2). Jika sisa hasilnya adalah 0, itu adalah bilangan genap, dan eventCount ditingkatkan. Jika sisa hasilnya bukan 0, itu adalah bilangan ganjil, dan oddCount ditingkatkan.
*Setelah keluar dari loop, program mencetak jumlah bilangan genap dan ganjil yang telah dihitung.
*Jadi, program ini memberikan cara untuk menghitung jumlah bilangan genap dan ganjil dari serangkaian bilangan bulat positif yang dimasukkan oleh pengguna. Program berjalan hingga pengguna memasukkan angka negatif untuk menghentikannya.

## 3. _Soal Nomor Tiga_
 Berikut adalah penjelasan singkat tentang kode tersebut:
*Program mengimpor kelas Scanner dari pustaka java.util untuk memungkinkan input dari pengguna.
*Kode program dimulai dengan mendefinisikan kelas tugas3.
*Di dalam metode main, objek input dari kelas Scanner dibuat untuk mengambil input dari pengguna.
*Program mencetak pesan permintaan kepada pengguna untuk memasukkan tanggal lahir mereka dalam format "hari-bulan."
*Program kemudian mengambil dua input bilangan bulat, yaitu day (hari) dan month (bulan) dari pengguna menggunakan input.nextInt().
*Selanjutnya, program memanggil metode determineZodiacSign(day, month) untuk menentukan tanda zodiak berdasarkan tanggal lahir yang dimasukkan oleh pengguna. Hasilnya disimpan dalam variabel zodiacSign.
*Terakhir, program mencetak tanda zodiak yang telah ditentukan ke layar.
*Di dalam metode determineZodiacSign(int day, int month), program memeriksa nilai day dan month untuk menentukan tanda zodiak yang sesuai. Setiap tanda zodiak didefinisikan berdasarkan tanggal mulai dan berakhirnya.
*Misalnya, jika pengguna memasukkan tanggal lahir 25 Maret (day = 25, month = 3), maka program akan memeriksa tanggal tersebut dan menentukan bahwa tanda zodiaknya adalah "Aries" karena tanggal tersebut termasuk dalam rentang tanggal Aries (21 Maret - 22 April).
*Program ini memberikan cara sederhana untuk menentukan tanda zodiak berdasarkan tanggal lahir yang dimasukkan oleh pengguna.

## 4. _Soal Nomor Empat_
Berikut adalah penjelasan singkat tentang kode tersebut:
Program dimulai dengan mendefinisikan kelas tugas4.
*Di dalam metode main, sebuah array mylist yang berisi empat nilai pecahan (1.9, 2.7, 3.4, 6.1) dideklarasikan dan diinisialisasi.
*Kemudian, program memulai sebuah loop for dengan inisialisasi int i = 0. Loop ini akan berjalan selama i kurang dari atau sama dengan 3 (karena array memiliki empat elemen, yang diindeks mulai dari 0 hingga 3).
*Di dalam loop, program mencetak pesan yang berisi indeks dan nilai dari setiap elemen dalam array mylist. Pesan ini dibentuk dengan menggabungkan string, indeks (i), dan nilai dari array (mylist[i]) menggunakan operator +.
*Loop akan mengulang empat kali (indeks 0, 1, 2, dan 3) untuk mencetak semua elemen dalam array.
*Hasil dari program ini adalah mencetak setiap elemen dalam array mylist beserta indeksnya ke layar.. _Soal Nomor Empat_
