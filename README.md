1. Automation test skenario
- skenario membeli item hingga checkout
- skenario cancel checkout
- login dengan variasi user yang tersedia
- Verifikasi item cart yang diinput
- Verifikasi jumlah item
![image](https://github.com/Tedy0703/pekerjaanfinal/assets/109749529/0e76b7b3-3ff2-4eff-b5cc-98b3b7c1cb1e)


2. Implementasi page object model
![image](https://github.com/Tedy0703/pekerjaanfinal/assets/109749529/6dc53fa1-b67f-468b-8c26-657954845da5)

3. Flow
- Untuk menjalankan test @web secara umum harus mempersiapkan hooks untuk langkah sebelum atau sesudah dilakukan test, web feature/cucumber skenario yang mana akan dijalankan dalam test web tersebut.
Halaman webpage dan webstep, berhubungan yang mana webpage berisikan detail step yang akan dipanggil di webstep dan dijalankan pada skenario cucumber.
![image](https://github.com/Tedy0703/pekerjaanfinal/assets/109749529/ed521e93-b665-4378-afcb-871cdcc333a8)
- Untuk menjalankan test @api secara umum harus mempersiapkan testapi feature/cucumber untuk mempersiapkan skenario test api data yang akan dilakukan, seperti di folder json seperti halaman
endpoint dan model hingga endpoint untuk mengatur alamat data yang di test serta kode lainnya yang disiapkan untuk test. Halaman utiliy berfungsi halaman seperti hooks untuk test web yang mana membantu
ketika test data dilakukan. Pada halaman testapirunner menunjukan tempat step testapi dilakukan, untuk testapi page memiliki detail langkah yang akan dipanggil di testapistep, testapiselenium dan akan
dijalankan pada skenario testapi feature/cucumber.
![image](https://github.com/Tedy0703/pekerjaanfinal/assets/109749529/9433a533-414a-480f-bbe6-5a65f915db82)

