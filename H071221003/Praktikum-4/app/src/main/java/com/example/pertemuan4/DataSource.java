package com.example.pertemuan4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("kairirds","kairi ygnacio rayosdelsol"
                ,"siapa mau lawan?"
                ,R.drawable.kairiku,R.drawable.kairiku));

        instagrams1.add(new Instagram("d.o.hkyungsoo", "do kyung soo"
                ,"kerja dulu buat istriku"
                ,R.drawable.dokyungsoo,R.drawable.dokyungsoo));

        instagrams1.add(new Instagram("songkang_b", "song kang"
                ,"aku wamil dulu yaa"
                ,R.drawable.songkang, R.drawable.songkang));

        instagrams1.add(new Instagram("phs1116","park hyung sik"
                ,"manteppp"
                ,R.drawable.parkhyungsik,R.drawable.parkhyungsik));

        instagrams1.add(new Instagram("_choiii__", "choi hyun wook"
                ,"halooo"
                ,R.drawable.choihw,R.drawable.choihw));

        instagrams1.add(new Instagram("dntlrdl","choi woo shik"
                ,"kamis manis"
                ,R.drawable.choiws, R.drawable.choiws));

        instagrams1.add(new Instagram("eunwo.o_c","cha eunwoo"
                , "gabisa jelek maaf"
                ,R.drawable.eunwoo,R.drawable.eunwoo));

        instagrams1.add(new Instagram("hi_high_hiy","hwang in yeop"
                ,"udah ga sad nihh"
                ,R.drawable.hwanginyeop, R.drawable.hwanginyeop));

        instagrams1.add(new Instagram("moon_ko_ng", "moon bin"
                ,"maaf ya udah beda alam"
                ,R.drawable.moonbin, R.drawable.moonbin));

        instagrams1.add(new Instagram("alyarawl", "rawl"
                ,"akur-akur suamiku!"
                ,R.drawable.me, R.drawable.me));
        return instagrams1;
    }
}
