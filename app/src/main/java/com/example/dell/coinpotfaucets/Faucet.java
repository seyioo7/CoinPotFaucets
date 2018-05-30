package com.example.dell.coinpotfaucets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Faucet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faucet);


        Button MyButton = (Button) findViewById(R.id.HowToClaimFaucetBtn);
        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), HowToClaimFaucet.class);
                startActivity(startIntent);
            }
        });

        Button bitFunBtn = (Button) findViewById(R.id.bitFunBtn);
        bitFunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://bitfun.co/?ref=B496E8F76FB5";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button bonusBitcoinBtn = (Button) findViewById(R.id.bonusBitcoinBtn);
        bonusBitcoinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://bonusbitcoin.co/?ref=5DA245BD46FC";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button moonBitcoinBtn = (Button) findViewById(R.id.moonBitcoinBtn);
        moonBitcoinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://moonbit.co.in/?ref=2f785d0d34b9";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button moonLitecoinBtn = (Button) findViewById(R.id.moonLitecoinBtn);
        moonLitecoinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://moonliteco.in/?ref=a49e4b088c99";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button moonDogecoinBtn = (Button) findViewById(R.id.moonDogecoinBtn);
        moonDogecoinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://moondoge.co.in/?ref=95baa78c3a1b";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button moonDashBtn = (Button) findViewById(R.id.moonDashBtn);
        moonDashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://moondash.co.in/?ref=6A99EBB4B529";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button moonCashBtn = (Button) findViewById(R.id.moonCashBtn);
        moonCashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://moonbitcoin.cash/?ref=22FA8ED8D190";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });

        Button CoinPotBtn = (Button) findViewById(R.id.CoinPotBtn);
        CoinPotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.coinpot.co";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoGoogle);
                }
            }
        });
    }
}
