package com.grup15.gtuticaret;

import android.os.Bundle;

/**
 * Created by Celal Can on 26.04.2018.
 */

public class Ayarlar extends MenuBar {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        super.menuBar();
    }
}
