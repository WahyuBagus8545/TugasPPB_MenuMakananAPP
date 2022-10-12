package com.wahyubagus.menumakananapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView rec_Makanan;
    private ArrayList <Makanan> listmakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan=findViewById(R.id.rec_Makanan);
        initData();

        rec_Makanan.setAdapter(new MakananAdapter(listmakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listmakanan = new ArrayList<>();
        listmakanan.add(new Makanan("Bakso",
                "Rp. 10.000",
                "Bakso merupakan olahan dari daging sapi yang dihaluskan, dicampur dengan bumbu halus, tepung terigu, dan penyedap rasa. Adonan tersebut dibentuk bola lalu direbus hingga matang.",
                R.drawable.bakso));
        listmakanan.add(new Makanan("Gado-gado",
                "Rp. 15.000",
                "Gado-gado adalah makanan khas dari Jakarta yang menyehatkan karena terdiri dari rebusan sayuran seperti kangkung, wortel, labu siam, selada, timun dan irisan tempe yang disiram dengan saus kacang yang gurih.",
                R.drawable.gadogado));
        listmakanan.add(new Makanan("Nasi goreng",
                "Rp. 10.000",
                "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica dan kecap manis.",
                R.drawable.nasigoreng));
        listmakanan.add(new Makanan("Rendang",
                "Rp. 20.000",
                "Rendang atau randang adalah Masakan Minangkabau yang berbahan dasar daging yang berasal dari Sumatera Barat, Indonesia. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama dengan menggunakan aneka rempah-rempah dan santan.",
                R.drawable.rendang));
        listmakanan.add(new Makanan("Sate",
                "Rp. 15.000",
                "Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu.",
                R.drawable.sate));
        listmakanan.add(new Makanan("Soto",
                "Rp. 15.000",
                "Soto, Coto, Sauto, Tauto adalah makanan khas Indonesia sejenis sup dengan kuah rebusan ayam atau sapi. Soto biasanya memakai dua jenis daging, yakni daging ayam dan dan daging sapi.",
                R.drawable.soto));
    }

}