package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyUniversities();

    private static ArrayList<Instagram> generateDummyUniversities() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Kairi", "main", R.drawable.kairikuu, R.drawable.kairikuu, R.drawable.kairikuu,"2 JT", "100"));
        instagrams1.add(new Instagram("Choi", "met berbuka bunda", R.drawable.choi, R.drawable.choi, R.drawable.choi, "5 JT", "64"));
        instagrams1.add(new Instagram("Do", "ilmu padi", R.drawable.dokyungsoo, R.drawable.dokyungsoo, R.drawable.dokyungsoo, "13 JT", "0"));
        instagrams1.add(new Instagram("Eunwoo", "cape ganteng", R.drawable.eunwoo, R.drawable.eunwoo, R.drawable.eunwoo, "9 JT", "0"));
        instagrams1.add(new Instagram("In Yeop", "sad mulu", R.drawable.hwanginyeop, R.drawable.hwanginyeop, R.drawable.hwanginyeop, "6 JT", "7"));
        instagrams1.add(new Instagram("Jae Bum", "anu", R.drawable.jaebum, R.drawable.jaebum, R.drawable.jaebum, "17 JT", "90"));
        instagrams1.add(new Instagram("Park Hyung", "halo", R.drawable.phs, R.drawable.phs, R.drawable.phs, "9 JT", "0"));
        instagrams1.add(new Instagram("Song Kang", "bye mau wamil", R.drawable.songkang, R.drawable.songkang, R.drawable.songkang, "12 JT", "0"));
        instagrams1.add(new Instagram("Ung", "back", R.drawable.ung, R.drawable.ung, R.drawable.ung, "10 JT", "5"));
        instagrams1.add(new Instagram("Yi Chan", "hehe", R.drawable.yichan, R.drawable.yichan, R.drawable.yichan, "4 JT", "1"));
        return instagrams1;
    }
}
