/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the View that shows numbers category

        TextView numbers = (TextView)findViewById(R.id.numbers);
        // Set a clickListener on that View
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }

        });

    }



    public void openFamilyMembersList (View view){
        Intent familyList = new Intent(this, FamilyActivity.class);
        startActivity(familyList);

    }

    public void openColorsList (View view){
        Intent colorsList = new Intent(this, ColorsActivity.class);
        startActivity(colorsList);
    }

    public void openPhrasesList (View view){
        Intent phasesList = new Intent(this, PhrasesActivity.class);
        startActivity(phasesList);
    }
}
