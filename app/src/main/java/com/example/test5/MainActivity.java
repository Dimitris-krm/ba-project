package com.example.test5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView apant;
    String options[]= {"Ναί έχεις να πάτησεις σχολή σχεδόν έναν μήνα,",
            "Όχι έχει ώραια μέρα για κάφε σήμερα",
            "Ναί",
            "Όχι",
            "Όχι,είναι ανάδρομος ο Ερμής",
            "Ναί,θα δώσει ΣΟΣ ο κ.Κοκκώνης",
            "Κάνε,αυτό που λέει η Καρδιά σου",
            "Όχι,είναι παγκόσμια μέρα καθισιού σήμερα",
            "Ναί,έχεις χαλαρό πρόγραμμα σήμερα ",
            "Όχι,πρέπει να βάλεις πλυντήριο",
            "Ναί,κοντέυεις για πτυχίο",
            "Ναί,άδραξε τη μέρα και πήγαινε να μορφωθείς",
            "Όχι,πέσε ξανά κοιμήσου καλύτερα",
            "Όχι,παράτα τα όλα και γίνε δημοτικός σύμβουλος",
            "Ναί,έφτιαξαν το μικρό αμφιθέατρο ",
            "Παίξτο κορώνα γράμματα",
            "Όχι, η Λίτσα Πατέρα είπε οτι σήμερα δεν είναι καλή μέρα για εργασία",
            "Ναί,έχει ωραίο καιρο για μάθημα"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            button = (Button) findViewById(R.id.button);
            apant = (TextView) findViewById(R.id.apant);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random  randGen = new Random();
                final int rando = randGen.nextInt(18);
                apant.setText(options[rando]);
            }
        });


    }
}
