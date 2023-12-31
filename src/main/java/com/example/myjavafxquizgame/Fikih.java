package com.example.myjavafxquizgame;

public class Fikih {
    static String [][] option = {
            {"Syahadat", "Haji", "Sholat", "Zakat"},
            {"Syahadat", "Haji", "Sholat", "Zakat"},
            {"Syahadat", "Haji", "Sholat", "Zakat"},
            {"5", "7", "6", "4"},
            {"5", "8", "17", "30"},
            {"4", "3", "5", "2"},
            {"4", "3", "5", "2"},
            {"4", "3", "5", "2"},
            {"4", "3", "5", "2"},
            {"4", "3", "5", "2"},
            //10
            {"15", "12", "17", "13"},
            //11 (opt1 dan opt 3) index ke 0 sama 3 kepanjangan :
            //|                                           yang ini                                                       |                     |                                      yang ini                                  |
            {"Aku bersaksi bahwa tidak ada Tuhan melainkan Allah.Dan aku bersaksi bahwa Nabi Muhammad adalah utusan Allah", "Allah Maha Besar", "Dengan menyebut nama-Mu ya allah, aku berlindung dari godaan setan yang terkutuk", "Segala puji bagi allah tuhan semesta alam"},
            {"أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللهُ", "أَشْهَدُ أَنَّ مُحَمَّدًا رَسُوْلُ اللهِ", "أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُوْلُ اللهِ", "اللهُ أَكْبَرُ اللهُ أَكْبَرُ اللهُ أَكْبَرُ  "},
            {"Sunnah", "Haram", "Wajib", "Makruh"},
            {"Makan", "Haid", "Minum", "Kentut"},
            {"Menahan", "Berdoa", "Sabar", "Memakan"},
            {"Ibu Hamil", "Orang tua atau Lansia", "Perempuan yang sedang haid", "Orang yang sudah baligh"},
            {"Menghadap kiblat", "Berhadas besar", "Berhadas kecil", "Niat"},
            {"Kiblat", "Muka", "Barat", "Depan"},
            {"Al-Kafirun", "Al-Fatihah", "Al-Ikhlas", "Al-Baqarah"},
            //20
            {"Tenang atau diam sejenak", "Membaca niat", "Do'a", "Tertib"},
            {"Bersin", "Minum", "Makan", "Bergerak lebih dari 3 kali"},
            {"Rukun Sholat", "Gerakan Sholat", "Syarat Sah Sholat", "Hal-Hal yang membatalkan sholat"},
            {"6", "7", "8", "5"},
            {"Dengan tanah", "Kecil", "Air liur anjing", "Besar"},
            {"َشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللهُ", "أَشْهَدُ أَنَّ مُحَمَّدًا رَسُوْلُ الل", "أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُوْلُ اللهِ", "اللهُ أَكْبَرُ"},
            {"Menyentuh kemaluan secara langsung", "Minum ", "Kencing ", "Muntah"},
            {"Minum", "Tidur nyenyak", "Islam", "Bersin"},
            {"Niat", "Kentut", "Minum", "Muntah"},
            {"Mubalig", "Muzakki", "Mustahik", "Mualaf"},
            //30
            {"Mubalig", "Muzakki", "Mustahik", "Mualaf"},
            {"5", "6", "7", "8"},
            {"Ibnu Sabil", "Muzakki", "Fakir", "Mualaf"},
            {"2", "3", "4", "1"},
            {"Makanan Pokok", "Tanah", "Emas", "Perak"},
            {"Fitrah", "Biasa", "Mal", "Emas"},
            {"Ihram", "Puasa", "Sholat", "Zakat"},
            {"Ihram", "Wukuf", "Mikat", "Sai"},
            {"Qiran", "Haji dan Umroh", "Tamattu", "Ifrad"},
            {"Qiran", "Haji dan Umroh", "Tamattu", "Ifrad"},
            //40
            {"Qiran", "Haji dan Umroh", "Tamattu", "Ifrad"},
            {"3", "2", "4", "5"},
            {"Hutang", "Dam", "Emas", "Uang"},
            {"Tahalul", "Sai", "Mabit", "Tawaf"},
            {"Tahalul", "Sai", "Mabit", "Tawaf"},
            {"Tahalul", "Sai", "Mabit", "Tawaf"},
            {"Tahalul", "Sai", "Mabit", "Tawaf"},
            {"7", "6", "8", "9"},
            {"7", "6", "8", "9"},
            {"Sapi", "Ayam", "Unta", "Kambing"},
            //50
    };

    static String [] question = {
            "Rukun Islam yang kelima adalah?",
            "Rukun Islam yang keempat adalah?",
            "Rukun islam yang pertama adalah?",
            "Berapa jumlah rukun Islam?",
            "Berapa jumlah Sholat Fardhu dalam sehari semalam?",
            "Berapa jumlah raka'at Sholat Subuh?",
            "Berapa jumlah raka'at Sholat Dzuhur?",
            "Berapa jumlah raka'at Sholat Asar?",
            "Berapa jumlah raka'at Sholat Maghrib?",
            "Berapa jumlah raka'at Sholat Isya?",
            //10
            "Berapa jumlah raka'at Sholat Fardhu dalam sehari semalam?",
            "Apa arti dua kalimat syahadat?",
            "Bagaimana lafaz/tulisan dua kaliamt syahadat?",
            "Hukum menjalankan ibadah puasa di bulan Ramadhan bagi umat Islam adalah...",
            "Dibawah ini yang merupakan hal-hal yang membatalkan ibadah puasa, kecuali...",
            "Puasa secara bahasa berarti?",
            "Orang yang diwajibkan untuk melaksanakan ibadah puasa adalah...",
            "Syarat sah sholat salah satunya adalah...",
            "Syarat sah sholat salah satunya adalah menghadap ke...",
            "Surah yang wajib dibaca saat melaksakan ibadah sholat fardhu adalah...",
            //20
            "Tuma'ninah memiliki arti?",
            "Hal-hal yang membatalkan sholat, kecuali...",
            "Makan dan minum dalam sholat adalah dapat...",
            "Rukun wudhu ada berapa?",
            "Wudhu berguna untuk membersihkan hadas?",
            "Bagaimana lafaz/tulisan takbiratul ihram?",
            "Hal-hal yang membatalkan wudhu, kecuali?",
            "Hal-hal yang membatalkan wudhu?",
            "Di bawah ini yang merupakan rukun wudhu adalah...",
            "Orang yang menerima zakat disebut?",
            //30
            "Orang yang mengeluarkan zakat disebut dengan...",
            "Ada berapa golongan orang yang berhak menerima zakat?",
            "Orang yang menerima zakat kecuali?",
            "Ada berapa jenis zakat secara umum?",
            "Zakat fitrah dapat dikeluarkan berupa?",
            "Zakat yang dikenakan atas harta yang dimiliki oleh seseorang disebut zakat?",
            "Berikut ini yang merupakan rukun haji adalah?",
            "Batas waktu dan tempat bagi dimulainya ibadah haji dan umrah (batas-batas yang telah ditetapkan) adalah?",
            "Melaksanakan ibadah haji tanpa melaksanakan ibadah umroh disebut?",
            "Melaksanakan ibadah haji  dan menggabungkan dengan ibadah umroh disebut?",
            //40
            "Melaksanakan ibadah umroh terlebih dahulu kemudian melaksanakan ibadah haji disebut?",
            "Ada berapa jenis haji?",
            "Orang yang melanggar larangan haji atau umroh wajib membayar?",
            "Berjalan kaki dan berlari-lari kecil di antara kedua bukit Shafa dan Marwah disebut?",
            "Mencukur atau menggunting beberapa helai rambut, paling sedikit tiga helai disebut?",
            "Mengelilingi Ka’bah sebanyak tujuh kali putaran disebut?",
            "Bermalam di Muzdalifah dan di Mina untuk memenuhi rangkaian wajib haji disebut?",
            "Tawaf adalah mengelilingi Ka’bah sebanyak berapa kali?",
            "Sai adalah berjalan kaki dan berlari-lari kecil di antara kedua bukit Shafa dan Marwah sebanyak berapa kali?",
            "Berikut ini hewan apa saja yang bisa dijadikan hewan kurban, kecuali?"
            //50
    };

    static String [] answer = {
            "Haji", "Zakat", "Syahadat", "5", "5", "2", "4", "4", "3", "4",
            //10
            "17",
            "Aku bersaksi bahwa tidak ada Tuhan melainkan Allah.\nDan aku bersaksi bahwa Nabi Muhammad adalah utusan Allah",
            "أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللهُ وَأَشْهَدُ أَنَّ مُحَمَّدًا رَسُوْلُ اللهِ",
            "Wajib",
            "Kentut",
            "Menahan",
            "Orang yang sudah baligh",
            "Menghadap kiblat",
            "Kiblat",
            "Al-Fatihah",
            //20
            "Tenang atau diam sejenak",
            "Bersin",
            "Hal-Hal yang membatalkan sholat",
            "6",
            "Kecil",
            "اللهُ أَكْبَرُ",
            "Minum",
            "Tidur nyenyak",
            "Niat",
            "Mustahik",
            //30
            "Muzakki",
            "8",
            "Muzakki",
            "2",
            "Makanan pokok",
            "Mal",
            "Ihram",
            "Mikat",
            "Ifrad",
            "Qiran",
            //40
            "Tamattu",
            "3",
            "Dam",
            "Sai",
            "Tahalul",
            "Tawaf",
            "Mabit",
            "7",
            "7",
            "Ayam"
    };
}
