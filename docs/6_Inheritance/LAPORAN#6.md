# Laporan Praktikum #6 - INHERITANCE (PEWARISAN)

## Kompetensi

1. Memahami konsep dasar inheritance atau pewarisan.
2. Mampu membuat suatu subclass dari suatu superclass tertentu.
3. Mampu mengimplementasikan konsep single dan multilevel inheritance.
4. Mampu membuat objek dari suatu subclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclass nya.

***
## Ringkasan Materi
1. Extends
2. Hak Akses
3. Super
4. Super contsructor
5. Single Inheritance
6. Multilevel inheritance
***
## Percobaan
### Percobaan 1 - Extends
>![](img/Percobaan1/1.PNG)  
>
>![](img/Percobaan1/2.PNG)
>
>![](img/Percobaan1/3.PNG)
>
>[Kode program Percobaan 1 ClassA1841720144Rizqi.java](../../src/6_Inheritance/Percobaan1/ClassA1841720144Rizqi.java)  
>[Kode program Percobaan 1 ClassB1841720144Rizqi.java](../../src/6_Inheritance/Percobaan1/ClassB1841720144Rizqi.java)  
>[Kode program Percobaan 1 Percobaan11841720144Rizqi.java](../../src/6_Inheritance/Percobaan1/Percobaan11841720144Rizqi.java)  
***

#### Pertanyaan 
1.	Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!  
`Jawab`  
>![](img/Percobaan1/Pertanyaan/1.PNG)  
>
>![](img/Percobaan1/Pertanyaan/2.PNG)
>
>![](img/Percobaan1/Pertanyaan/3.PNG)
>
>[Kode program Percobaan 1 Fix ClassA1841720144Rizqi.java](../../src/6_Inheritance/Percobaan1/fixed/ClassA1841720144Rizqi.java)   
>[Kode program Percobaan 1 Fix ClassB1841720144Rizqi.java](../../src/6_Inheritance/Percobaan1/fixed/ClassB1841720144Rizqi.java)   
>[Kode program Percobaan 1 Fix Percobaan11841720144Rizqi.java](../../src/6_Inheritance/Percobaan1/fixed/Percobaan11841720144Rizqi.java)   
***

2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!  
`Jawab`  
    >Karena Program class child B belum ditambahkan syntag extends ke class parent A.

***
### Percobaan 2 - Hak Akses

>![](img/Percobaan2/1.PNG)  
>
>![](img/Percobaan2/2.PNG)
>
>![](img/Percobaan2/3.PNG)
>
>[Kode program Percobaan 2 ClassA1841720144Rizqi.java](../../src/6_Inheritance/Percobaan2/ClassA1841720144Rizqi.java)  
>[Kode program Percobaan 2 ClassB1841720144Rizqi.java](../../src/6_Inheritance/Percobaan2/ClassB1841720144Rizqi.java)  
>[Kode program Percobaan 2 Percobaan21841720144Rizqi.java](../../src/6_Inheritance/Percobaan2/Percobaan21841720144Rizqi.java)
***  
#### Pertanyaan 
1.	Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!   
`Jawab`  
>![](img/Percobaan2/Pertanyaan/1.PNG)  
>
>![](img/Percobaan2/Pertanyaan/2.PNG)
>
>![](img/Percobaan2/Pertanyaan/3.PNG)
>
>[Kode program Percobaan 2 fix ClassA1841720144Rizqi.java](../../src/6_Inheritance/Percobaan2/fixed/ClassA1841720144Rizqi.java)  
>[Kode program Percobaan 2 fix ClassB1841720144Rizqi.java](../../src/6_Inheritance/Percobaan2/fixed/ClassB1841720144Rizqi.java)  
>[Kode program Percobaan 2 fix Percobaan21841720144Rizqi.java](../../src/6_Inheritance/Percobaan2/fixed/Percobaan21841720144Rizqi.java) 
2.	Jelaskan apa penyebab program pada percobaan 2 ketika dijalankan terdapat error!  
`Jawab`  
    >Karena Program class child B belum ditambahkan syntag extends ke class parent A dan modifiernya private, dimana private hanya bisa diakses jika satu class dan tidak bisa diakses di kelas lain.
### Percobaan 3 - Super
>![](img/Percobaan3/1.PNG)  
>
>![](img/Percobaan3/2.PNG)
>
>![](img/Percobaan3/3.PNG)
>
>[Kode program Percobaan 3 Bangun1841720144Rizqi.java](../../src/6_Inheritance/Percobaan3/Bangun1841720144Rizqi.java)  
[Kode program Percobaan 3 Tabung1841720144Rizqi.java](../../src/6_Inheritance/Percobaan3/Tabung1841720144Rizqi.java)  
[Kode program Percobaan 3 Percobaan31841720144Rizqi.java](../../src/6_Inheritance/Percobaan3/Percobaan31841720144Rizqi.java)  
***
#### Pertanyaan 
1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!    
![](img/Percobaan3/SOAL/1.PNG)  
`Jawab`  
    >Super tersebut berfungsi untuk memanggil atribut dari class parent. dimana atribut phi dan r tersebut berorientasi pada phi dan r pada class paarent.
2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!  
![](img/Percobaan3/SOAL/2.PNG) 
`Jawab`  
    >super untuk memanggil atribut pada class parent dan this untuk memanggil atribut yang telah ditentukan untuk menghindari dari penamaan atribut yang sama.
    dalam program diatas **phi dan r** berorieantasi pada atribut class parent jadi **phi dan r** menggunakan super, sedangkan **t** menggunakan this untuk memanggil atribut **t**  yang telah ditentukan sebelumnya.
 
3.	Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut!  
`Jawab`  
    >karena class tabung merupakan turunan dari class bangun oleh karenanya class tabung bisa memanggil atribut dari class bangun dengan cara menggunakan **super**

### Percobaan 4 - super contsructor
#### Pertanyaan 
