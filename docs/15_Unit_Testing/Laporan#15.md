# Laporan Praktikum #15 - Unit Testing
## Kompetensi
Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
1. Memahami konsep dan fungsi unit testing
2. Menerapkan unit testing dengan JUnit pada program sederhana.
3. Menerapkan unit testing dengan JUnit pada progam yang terkoneksi database
---
## Ringkasan Materi
Mengenal Unit Testing dengan JUnit

Dalam Software Development Life Cycle, testing merupakan fase yang cukup penting. Dari fase ini kita akan mengetahui mutu dari aplikasi yang kita buat. Apakah aplikasi yang kita buat relevan dengan kebutuhan user, apakah aplikasi yang kita buat bebas dari bug, apakah aplikasi kita konsisten outputnya, dsb akan terjawab pada fase testing ini.

Ada 2 jenis method testing yang umum digunakan yaitu Black Box Testing dan White Box Testing.

* Black Box Testing Menurut Myers (1979) : Proses menjalankan program dengan maksud menemukan kesalahan. Menurut IEEE (1990) : Pengujian yang mengabaikan mekanisme internal sistem atau komponen dan fokus semata-mata pada output yang dihasilkan yang merespon input yang dipilih dan kondisi eksekusi.

* White Box Testing Metode perancangan test case yang menggunakan struktur kontrol dari perancangan prosedural untuk mendapatkan test case. Digunakan untuk mengetahui cara kerja internal suatu perangkat lunak. Pengujian dilakukan untuk menjamin operasi-operasi internal sesuai dengan spesifikasi yang telah ditetapkan dengan menggunakan struktur kendali dari prosedur yang dirancang.

Pada bahasa pemrograman java, telah dibuat suatu library untuk menangani unit testing. Salah satu yang cukup mainstream yaitu JUnit.

Menggunakan JUnit sebenarnya cukup simple dan mudah. Prinsip utama JUnit adalah buat test class untuk setiap class yang anda buat. Dan uji semua method yang ada pada class tersebut. JUnit juga sudah built in di beberapa IDE seperti Blue J dan Eclipse. Apabila anda menggunakan netbeans, memang anda harus mendownloadnya jar nya dulu namun setelah itu netbeans bisa me-generate test class sesuai dengan class yang kita buat.
---
## Percobaan
### Percobaan 1
Pada percobaan yang pertama ini kita akan membuat sebuah program sederhana yang mengilustrasikan sebuah aplikasi pengiriman pesan. Pada program tersebut terdapat satu class utama dimana didalamnya terdapat beberapa method sederhana yang nantinya akan dibuatkan unit test-nya.

Buatlah sebuah project baru di NetBeans dengan nama LearnUnitTesting. Pada package unittest, di tempat yang sama dengan class mainnya, buatlah 1 file class baru bernama MessageProcessor.java.

>![](P1/1.PNG)

>![](P1/2.PNG)
>![](P1/3.PNG)

Sampai disini, aplikasi telah selesai dibuat. Berikutnya akan kita buat pengetesanunit sederhana untuk program kita tersebut. Untuk melakukannya, pertama kali buatlah sebuah package bernama unittesting (sama dengan nama package project), di folder Test Packages. Pada package tersebut, tambahkan 2 buah file class bernama MessageProcessorTest.java dan TestRunner.java.
>![](P1/4.PNG)
>![](P1/5.PNG)
>![](P1/6.PNG)  

[Kode program Percobaan 1 LearnUnitTesting.java](../../src/15_Unit_Testing/unittest/LearnUnitTesting.java)    
[Kode program Percobaan 1 MessageProcessor1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/MessageProcessor1841720144Rizqi.java)    
[Kode program Percobaan 1 MessageProcessorTest1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/MessageProcessorTest1841720144Rizqi.java)    
[Kode program Percobaan 1  TestRunner1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/TestRunner1841720144Rizqi.java)    

### Percobaan 2
Pada percobaan kedua kita akan mencoba membuat test case dari salah satu percobaan pada jobsheet minggu ke 14. Struktur file dari percobaan ke satu terdiri dari 4 file class yaitu DBHelper.java, FormKategori.java, Kategori.java dan TestBackend.java.

>![](P2/1.PNG)

>![](P1/2.PNG)
>![](P1/4.PNG)
>![](P1/3.PNG)


[Kode program Percobaan 2 Kategori1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/Kategori1841720144Rizqi.java)  
[Kode program Percobaan 2 Kategori1841720144RizqiTest.java](../../src/15_Unit_Testing/unittest/database/Kategori1841720144RizqiTest.java)  
[Kode program Percobaan 2  TestRunner1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/TestRunner1841720144Rizqi.java)  

---
## Tugas
1. Buat test case untuk percobaan kedua pada jobsheet ke 14.

>![](P1/1.PNG)
>![](P1/2.PNG)
>![](P1/3.PNG)

[Kode program Tugas Anggota1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/Anggota1841720144Rizqi.java)  
[Kode program Tugas Anggota1841720144RizqiTest.java](../../src/15_Unit_Testing/unittest/database/Anggota1841720144RizqiTest.java)  
[Kode program Tugas  TestRunner1841720144Rizqi.java](../../src/15_Unit_Testing/unittest/TestRunner1841720144Rizqi.java)  

---
## Kesimpulan
Pada jobsheet ini kita dapat mengetahui,

*    Konsep dan fungsi unit testing itu sendiri,
*   Menerapkan unit testing dengan JUnit pada program sederhana,
*    Menerapkan unit testing dengan JUnit pada progam yang terkoneksi database;

---
## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Muhammad Rizqi Mahendra)***


