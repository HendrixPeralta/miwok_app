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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList <Word>();

        numbers.add(new Word("one", "lutti", R.drawable.number_one ));
        numbers.add(new Word("two", "otiiko", R.drawable.number_two));
        numbers.add(new Word("three", "tolookosu", R.drawable.number_three));
        numbers.add(new Word("four", "oyyisa", R.drawable.number_four));
        numbers.add(new Word("five", "massokka", R.drawable.number_five));
        numbers.add(new Word("six", "temmokka", R.drawable.number_six));
        numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        numbers.add(new Word("eight", "kawinta", R.drawable.number_eight));
        numbers.add(new Word("nine", "wo'e", R.drawable.number_nine));
        numbers.add(new Word("ten", "na'aacha", R.drawable.number_ten));


        WordAdapter adapter =
                new WordAdapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        if (listView != null) {
            listView.setAdapter(adapter);
        }


    }
}
