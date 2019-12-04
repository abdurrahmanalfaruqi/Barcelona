package com.example.myapplication;

import java.util.ArrayList;

public class datapemain {
    private static String[] namaPemain ={
            "Ter stegen",
            "Umtiti",
            "Pique",
            "Sergio roberto",
            "Jordi alba",
            "Ivan rakitic",
            "Sergio busquets",
            "Arthur melo",
            "Lionel messi",
            "Luis suarez",
            "Antoine griezmann",
    };
    private static String[] pemainDetail ={
            "Marc-André ter Stegen (lahir di Monchengladbach, 30 April 1992; umur 27 tahun) adalah seorang pemain sepak bola asal Jerman yang saat ini bermain untuk bermain di Barcelona sebagai penjaga gawang.",
            "Samuel Yves Umtiti adalah seorang pemain sepak bola berkewarganegaraan Prancis kelahiran Kamerun yang bermain untuk klub FC Barcelona biasa bermain pada posisi bek. Umtiti memulai karier juniornya di klub Lyon kemudian memulai karier seniornya di klub tersebut sejak tahun 2011",
            "Gerard Piqué Bernabeu merupakan seorang pemain sepak bola berkebangsaan Spanyol yang dulu pernah membela klub Manchester United F.C.. Dia membela klub tersebut dari FC Barcelona B sejak 1 Juli 2004. Pada musim 2006-2007 dia dipinjamkan ke Real Zaragoza. Dia membela tim nasional Spanyol U17, U19, dan U21",
            "Sergi Roberto Carnicer adalah pemain sepak bola Spanyol yang bermain untuk FC Barcelona, berposisi terutama sebagai bek sayap, ia juga dapat bermain di posisi gelandang tengah, gelandang bertahan atau gelandang sayap",
            "Jordi Alba Ramos adalah seorang pemain sepak bola berkewarganegaraan Spanyol yang bermain untuk klub FC Barcelona pada posisi bek",
            "Ivan Rakitić adalah seorang pemain sepak bola berkewarganegaraan Kroasia kelahiran Swiss yang bermain untuk klub Barcelona pada posisi gelandang. Rakitic memulai karier profesionalnya di Basel dan menghabiskan dua musim dengan mereka sebelum ia ditandatangani oleh Schalke 04",
            "Sergio Busquets merupakan seorang pemain sepak bola Spanyol yang berposisi sebagai gelandang bertahan. Saat ini ia bermain untuk Barcelona. Ia juga bermain untuk tim nasional Spanyol.",
            "Arthur Henrique Ramos de Oliveira Melo, umumnya dikenal sebagai Arthur Melo atau hanya Arthur, adalah pemain sepak bola Brasil yang bermain sebagai gelandang untuk klub Spanyol Barcelona dan tim nasional Brasil.",
            "Lionel Andrés Messi adalah seorang pemain sepak bola Argentina yang saat ini bermain untuk FC Barcelona dan merupakan kapten tim nasional sepak bola Argentina dan FC Barcelona, bermain sebagai penyerang. Ia adalah pencetak gol terbanyak Barcelona sepanjang sejarah",
            "Luis Alberto Suárez Díaz adalah seorang pemain sepak bola professional Uruguay yang bermain di posisi striker untuk klub FC Barcelona Dia juga anggota tim nasional Uruguay. Pada tahun 2006, Suárez pindah ke Belanda untuk bermain bagi Groningen di Eredivisie. Suárez ditransfer ke Ajax pada tahun 2007.",
            "Antoine Griezmann adalah seorang pemain sepak bola Prancis yang saat ini bermain untuk klub FC Barcelona sebagai pemain sayap kiri atau penyerang. Terkenal karena akselerasi dan larinya yang cepat, ia saat ini mewakili Prancis di level senior dan masuk dalam skuat Piala Dunia 2014 dan 2018 silam",

    };
    private static int[]pemainphoto = {
           R.drawable.terstegan,
            R.drawable.umtiti,
            R.drawable.pique,
            R.drawable.sergioroberto,
            R.drawable.jordialba,
            R.drawable.rakitic,
            R.drawable.busquets,
            R.drawable.arthur,
            R.drawable.messi,
            R.drawable.suarez,
            R.drawable.griezman,

    };
    static ArrayList<Pemain> getListData() {
        ArrayList<Pemain> list =new ArrayList<>();
        for (int position =0; position< namaPemain.length;position++){
            Pemain pemain =new Pemain();
            pemain.setName(namaPemain[position]);
            pemain.setDetail(pemainDetail[position]);
            pemain.setPhoto(pemainphoto[position]);
            list.add(pemain);
        }
        return list;
    }
}
