# Post-Test-4-Pemrograman-Berorientasi-Objek
Yardan Raditya Rafi' Widyadhana | 2409116037 | Sistem Informasi A 2024 | Tema Program: Manajemen Jadwal Olahraga Pribadi

- Menerapkan Abstraction (minimal 1 abstract class atau 1 interface).
- Menerapkan Polymorphism (minimal menggunakan 1 Overloading dan 1 Overriding).
- Menggunakan kombinasi abstract class dan interface secara bersamaan dalam program.

# Deskripsi Program
Program Manajemen Jadwal Olahraga Pribadi ini dibuat menggunakan bahasa pemrograman Java dengan konsep Pemrograman Berorientasi Objek (PBO). Program ini berfungsi untuk membantu saya dalam mengatur jadwal olahraga sehari-hari, seperti menambahkan jadwal olahraga baru, menampilkan jadwal olahraga, memperbarui jadwal, dan menghapus jadwal olahraga.

# Penjelasan Penerapan Abstraction

<img width="831" height="705" alt="image" src="https://github.com/user-attachments/assets/a8562aaf-76a2-4f0f-a038-e7d7fb7d4d4e" />

<img width="635" height="520" alt="image" src="https://github.com/user-attachments/assets/6ab78f45-2328-4a1d-b616-b75e5f0d4f8b" />

Pada bagian ini, saya menerapkan abstraction melalui abstract class jadwal yang berisi abstract method tampilkanInfo(). Method ini tidak memiliki isi sehingga memaksa setiap subclass yang mewarisi jadwal untuk mengimplementasikannya. Subclass seperti jadwalolahraga dan jadwalrest memberikan implementasi masing-masing sesuai kebutuhan. Dengan cara ini, program memiliki kerangka dasar yang seragam namun tetap fleksibel untuk detail tiap subclass.

# Penjelasan Penerapan Polymorphism
[1]. Overriding

<img width="1305" height="599" alt="image" src="https://github.com/user-attachments/assets/d615e730-bdf1-4755-9c10-1034fed0df40" />

<img width="839" height="442" alt="image" src="https://github.com/user-attachments/assets/6a2573aa-c98f-456d-868b-22a0abcc9e27" />

Pada bagian ini, saya menerapkan polymorphism melalui method overriding. Pada setiap subclass (jadwalolahraga dan jadwalrest), method tampilkanInfo() dioverride dari abstract class jadwal agar menampilkan informasi sesuai kebutuhan masing-masing. Misalnya jadwalolahraga menampilkan jenis, durasi, hari, dan intensitas. jadwalrest menampilkan teks khusus bahwa hari tertentu adalah REST DAY. Dengan overriding, method yang sama (tampilkanInfo()) bisa memberikan hasil berbeda sesuai object yang dipanggil.

[2]. Overloading

<img width="854" height="142" alt="image" src="https://github.com/user-attachments/assets/c1713514-4b0d-4056-a921-5869c24185d0" />

<img width="1170" height="117" alt="image" src="https://github.com/user-attachments/assets/1c799569-321b-428e-a50e-03648b664131" />

<img width="847" height="115" alt="image" src="https://github.com/user-attachments/assets/d5f8dc0f-9ce6-4baa-96db-840c71d4e7e7" />

Pada bagian ini, saya menerapkan polymorphism dengan teknik overloading pada bagian constructor di class jadwal, jadwalolahraga, dan jadwalrest. Meskipun ketiganya sama-sama menggunakan constructor, namun jumlah dan tipe parameter yang dimiliki berbeda. Class jadwal memiliki constructor dengan tiga parameter (jenis, durasi, hari), sedangkan jadwalolahraga memiliki constructor dengan empat parameter (jenis, durasi, hari, intensitas), dan jadwalrest hanya memiliki satu parameter (hari). Dengan adanya perbedaan parameter ini, program dapat membuat objek sesuai kebutuhan dengan cara pemanggilan yang berbeda, meskipun nama constructornya sama.

# Nilai Tambah

<img width="470" height="272" alt="image" src="https://github.com/user-attachments/assets/9a4c51fa-28c1-41eb-8c18-b076bd20fbd1" />

<img width="1090" height="494" alt="image" src="https://github.com/user-attachments/assets/b53020c2-d52b-4816-ae7d-cd86d02fc3c8" />

Selain menggunakan abstract class jadwal dengan method tampilkanInfo(), saya juga menambahkan interface printable yang berisi method print(). Interface ini kemudian diimplementasikan oleh subclass jadwalolahraga dan jadwalrest. Setiap subclass memberikan implementasi berbeda pada method print(), misalnya jadwalolahraga → output [Print Jadwal Olahraga] ... jadwalrest → output [Print Jadwal Rest] ... Sehingga, selain menampilkan informasi jadwal melalui abstraksi, program juga mampu mencetak data jadwal dengan format tambahan dari interface.

# Menu Utama
Pada menu utama, user akan diberikan 6 pilihan dan user diminta untuk menginputkan angka sesuai pilihan yang telah disediakan.

<img width="535" height="279" alt="image" src="https://github.com/user-attachments/assets/4d192494-22fc-43ee-abea-18916becd119" />

Jika user menginputkan pilihan angka yang tidak disediakan, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan mengulang dibagian menu utama.

<img width="515" height="359" alt="image" src="https://github.com/user-attachments/assets/424dd24d-2c45-44ee-a940-aa404110e96a" />

Jika user menginputkan selain angka, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan mengulang dibagian menu utama.

<img width="517" height="358" alt="image" src="https://github.com/user-attachments/assets/f89c5529-24a0-4fa4-86af-4318f22c054c" />

# Penjelasan Menu Utama
[1]. Tambah Jadwal Olahraga

Untuk melakukan Create/Tambah, masukkan angka 1.

<img width="329" height="132" alt="image" src="https://github.com/user-attachments/assets/f33c1160-2e88-4af4-98d5-40d742e24f2b" />

Setelah itu, karena telah menerapkan inheritance, user akan diberikan 2 opsi untuk memilih jadwal yang ingin ditambahkan. Jika user menginputkan pilihan angka yang tidak disediakan, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan mengulang dibagian menu utama.

<img width="493" height="433" alt="image" src="https://github.com/user-attachments/assets/b091ce39-0712-47b0-862e-917285f41806" />

Jika user menginputkan selain angka, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan mengulang dibagian menu utama.

<img width="495" height="433" alt="image" src="https://github.com/user-attachments/assets/638aa251-8cd1-414f-ac2e-918400b01cbc" />

Untuk melakukan tambah jadwal olahraga, masukkan angka 1.

<img width="572" height="263" alt="image" src="https://github.com/user-attachments/assets/bc6d6bff-0a5f-4087-b0f0-2877486715a2" />

Setelah jadwal olahraga berhasil ditambahkan, program akan kembali ke menu utama.

<img width="578" height="459" alt="image" src="https://github.com/user-attachments/assets/ff455589-0dbd-45ef-8d98-5f3c276cba5f" />

Jika user tidak mengisi jenis, hari, durasi, dan intensitas olahraga yang ingin ditambahkan, maka akan muncul pesan seperti gambar dibawah dan program akan otomatis mengulang dibagian input jadwal olahraga.

<img width="587" height="307" alt="image" src="https://github.com/user-attachments/assets/25f39206-1797-4d61-877f-7336616e671c" />

Untuk melakukan tambah jadwal istirahat, masukkan angka 2.

<img width="507" height="155" alt="image" src="https://github.com/user-attachments/assets/3ccfbd12-84ec-484b-a80f-2130c8daad86" />

Setelah jadwal istirahat berhasil ditambahkan, program akan kembali ke menu utama.

<img width="496" height="380" alt="image" src="https://github.com/user-attachments/assets/0c5f2fff-dd04-4623-bc82-e38b338fe2f8" />

Jika user tidak mengisi hari istirahat yang ingin ditambahkan, maka akan muncul pesan seperti gambar dibawah dan program akan otomatis mengulang dibagian input jadwal istirahat.

<img width="320" height="179" alt="image" src="https://github.com/user-attachments/assets/650d78df-0a7d-4289-86af-e3e481ccd2e5" />

[2]. Lihat Jadwal Olahraga

Opsi ini digunakan ketika user ingin melihat jadwal olahraga dan istirahat yang telah ditambahkan sebelumnya.

<img width="767" height="265" alt="image" src="https://github.com/user-attachments/assets/72763d13-1716-4dce-928d-b25459b22721" />

Setelah operasi dijalankan maka program akan otomatis kembali ke menu utama.

<img width="769" height="569" alt="image" src="https://github.com/user-attachments/assets/64859bad-ee27-4723-8a9f-ce60f13b5ded" />

Jika user belum ada menambahkan jadwal olahraga di opsi tambah jadwal olahraga sebelumnya, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan kembali ke menu utama.

<img width="510" height="358" alt="image" src="https://github.com/user-attachments/assets/eb1594e8-e49d-4f80-a2b7-27e27043c841" />

[3]. Update Jadwal Olahraga

Opsi ini digunakan ketika user ingin melakukan perubahan pada jadwal olahraga, seperti hari, jenis olahraga, durasi, dan intensitas yang ingin diupdate sesuai keinginan user.

<img width="753" height="411" alt="image" src="https://github.com/user-attachments/assets/9820e7d1-3886-48cc-b06b-e036ca32bda4" />

Setelah operasi dijalankan maka program akan otomatis kembali ke menu utama.

<img width="619" height="458" alt="image" src="https://github.com/user-attachments/assets/7640e3f4-5283-4d5a-aafd-2c4168131de1" />

Jika jadwal olahraga telah berhasil diubah maka program otomatis akan meng-update jadwal olahraga yang sudah ada sebelumnya.

<img width="760" height="259" alt="image" src="https://github.com/user-attachments/assets/0c7e668a-2c55-46b6-b533-31506a420f63" />

Jika user menginputkan nomor jadwal yang tidak tersedia di daftar jadwal olahraga, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan kembali ke menu utama.

<img width="514" height="355" alt="image" src="https://github.com/user-attachments/assets/93b89222-5382-44ce-8926-aff341d4ea19" />

Jika user menginputkan selain angka atau tidak diisi, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan kembali ke menu utama.

<img width="562" height="355" alt="image" src="https://github.com/user-attachments/assets/cf8496a9-c610-4598-ae3a-8ff5d672dfe0" />

Jika user tidak mengisi jenis, hari dan durasi olahraga yang ingin diupdate, maka akan muncul pesan seperti gambar dibawah dan program akan otomatis mengulang dibagian input jadwal olahraga yang baru.

<img width="509" height="176" alt="image" src="https://github.com/user-attachments/assets/a6d25e0c-035e-403b-9e5d-0794fe62ed82" />

[4]. Hapus Jadwal Olahraga

Opsi ini digunakan ketika user ingin menghapus jadwal olahraga yang telah dibuat sebelumnya.

<img width="764" height="312" alt="image" src="https://github.com/user-attachments/assets/b9b9ed3b-2e49-4bce-9bb4-8852d431d4ab" />

Setelah operasi dijalankan maka program akan otomatis kembali ke menu utama.

<img width="509" height="359" alt="image" src="https://github.com/user-attachments/assets/8eca049e-8ee9-4fca-bd15-1c3db7e28f57" />

Jika jadwal olahraga telah berhasil dihapus maka program otomatis akan meng-update jadwal olahraga yang sudah ada sebelumnya.

<img width="765" height="239" alt="image" src="https://github.com/user-attachments/assets/b8fcbb0c-c593-4dbc-8c62-6eb01a5cb561" />

Jika user menginputkan nomor jadwal yang tidak tersedia untuk dihapus di daftar jadwal olahraga, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan kembali ke menu utama.

<img width="516" height="354" alt="image" src="https://github.com/user-attachments/assets/a08de2e8-20fe-4bcb-9899-3c132e8f9e3e" />

Jika user menginputkan selain angka atau tidak diisi, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan kembali ke menu utama.

<img width="629" height="357" alt="image" src="https://github.com/user-attachments/assets/9d800494-47b5-4fda-80b3-5beedaf7ef4d" />

[5]. Search Jadwal Olahraga

Opsi ini digunakan ketika user ingin mencari atau searching daftar jadwal olahraga yang sudah dibuat sebelumnya.

<img width="728" height="111" alt="image" src="https://github.com/user-attachments/assets/38148eb9-8fca-483f-b65e-3c8ccad3f4da" />

Setelah operasi dijalankan maka program akan otomatis kembali ke menu utama.

<img width="727" height="411" alt="image" src="https://github.com/user-attachments/assets/37ad27b5-356c-4896-86ed-092edfe35515" />

Jika user menginputkan Jenis/Hari/intensitas yang tidak tersedia di jadwal olahraga yang sudah dibuat sebelumnya, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan kembali ke menu utama.

<img width="624" height="390" alt="image" src="https://github.com/user-attachments/assets/dce4f933-074f-418a-8d41-ee8238434f44" />

Jika user tidak mengisi kata kunci untuk mencari jadwal olahraga, maka akan muncul pesan seperti gambar dibawah dan program akan otomatis mengulang dibagian input kata kunci untuk mencari jadwal.

<img width="527" height="105" alt="image" src="https://github.com/user-attachments/assets/5c96803d-4042-4f1e-a3e4-2eba009c0896" />

[6]. Keluar

Opsi ini digunakan ketika user sudah selesai menggunakan operasi-operasi yang ada di program jadwal olahraga ini. Jika user memilih opsi ini maka akan muncul pesan seperti gambar dibawah dan program selesai.

<img width="808" height="199" alt="image" src="https://github.com/user-attachments/assets/78637338-be63-49f7-8eb1-db5627fd090d" />

