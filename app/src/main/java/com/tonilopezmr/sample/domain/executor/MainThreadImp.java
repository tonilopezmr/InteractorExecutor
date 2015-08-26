/*
 * Copyright (C) 2014 Jorge Castillo Pérez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tonilopezmr.sample.domain.executor;

import android.os.Handler;
import android.os.Looper;

import com.tonilopezmr.interactorexecutor.MainThread;


/**
 * {@link MainThread} implementation based on a Handler instantiated over
 * the main looper obtained from Looper class.
 *
 * Documented by Pedro Vicente Gómez Sánchez.
 *
 * @author Antonio López
 */
public class MainThreadImp implements MainThread {

    private Handler handler;

    public MainThreadImp() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void post(Runnable runnable) {
        handler.post(runnable);
    }
}