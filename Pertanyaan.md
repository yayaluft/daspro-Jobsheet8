**--PERCOBAAN 1--**
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?

**Jawaban:**
1. Jika inisialisasi i=1 diubah menjadi i=0, maka jumlah bertambah satu karena perulangan dimulai dari angka 0.
2. Program tidak bisa mengeluarkan output, karena i=1 dan nilai inputan N lebih dari 1 maka kondisinya false.
3. Terjadi infinite loop 'bintang', karena i terus berkurang dan tidak pernah mencapai kondisi i<=N, sehingga kondisinya false dan program tidak berhenti.