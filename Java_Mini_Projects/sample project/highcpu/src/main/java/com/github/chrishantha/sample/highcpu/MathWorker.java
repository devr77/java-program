/*
 * Copyright 2015 M. Isuru Tharanga Chrishantha Perera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.chrishantha.sample.highcpu;

import java.math.BigDecimal;
import java.util.Random;

public class MathWorker implements Runnable {

    private Random random = new Random();

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        while (true) {
            double value = Math.atan(Math.sqrt(Math.pow(random.nextInt(10), random.nextDouble())));
            if (random.nextInt(10) > 5) {
                bigDecimal = bigDecimal.add(BigDecimal.valueOf(value));
            } else {
                bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(value));
            }
        }
    }
}
