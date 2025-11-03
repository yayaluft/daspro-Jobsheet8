**--PERCOBAAN 1--**
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?

**Jawaban:**
1. Jika inisialisasi i=1 diubah menjadi i=0, maka jumlah bertambah satu karena perulangan dimulai dari angka 0.
2. Program tidak bisa mengeluarkan output, karena i=1 dan nilai inputan N lebih dari 1 maka kondisinya false.
3. Terjadi infinite loop 'bintang', karena i terus berkurang dan tidak pernah mencapai kondisi i<=N, sehingga kondisinya false dan program tidak berhenti.

**--PERCOBAAN 2--**
1. Perhatikan perulangan luar. Jika pada sintaks **for**, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
2. Kembalikan program semula dimana inisialisasi **iOuter=1**. Kemudian perhatikan perulangan dalam, jika pada sintaks **for**, inisialisasi i=1 diubah menjadi i=0, apa yang akibantnya  
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya?
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
5. Silahkan commit dan push ke repository Anda.

**Jawaban:**
1. Jika inisialisasi iOuter=0, maka perulangan dimulai dari angka 0 sehingga jumlah barisnya bertambah satu. Contohnya jika N=5 maka barisnya berjumlah 6.
2. Jika inisialisasi i=0, maka perulangan i dimulai dari angka 0 sehingga jumlah kolomnya bertambah satu. Contohnya jika N=5 maka jumlah kolomnya 6.
3. Fungsi:
- Perulangan luar: berperan mengatur jumlah baris.
- Perulangan dalam: berperan mengatur jumlah bintang dalam baris (kolom).
4. System.out.println(); berperan untuk memindahkan ke baris baru setelah baris bintang telah selesai dicetak. Apabila sintaks ini dihapus maka semua bintang akan dicetak dalam satu baris, tanpa pindah baris.

