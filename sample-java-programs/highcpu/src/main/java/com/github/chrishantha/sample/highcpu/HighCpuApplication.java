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

import com.beust.jcommander.Parameter;
import com.github.chrishantha.sample.base.SampleApplication;
import com.github.chrishantha.sample.base.Utils;

public class HighCpuApplication implements SampleApplication {

    @Parameter(names = "--run-hashing", description = "Run Hashing Worker", arity = 1)
    private boolean runHashing = true;

    @Parameter(names = "--run-sleeping", description = "Run Sleeping Worker", arity = 1)
    private boolean runSleeping = true;

    @Parameter(names = "--run-math", description = "Run Math Worker", arity = 1)
    private boolean runMath = true;

    @Parameter(names = "--hashing-workers", description = "Hashing Workers")
    private int hashingWorkers = 6;

    @Parameter(names = "--sleeping-workers", description = "Sleeping Workers")
    private int sleepingWorkers = 4;

    @Parameter(names = "--math-workers", description = "Math Workers")
    private int mathWorkers = 2;

    @Parameter(names = "--hash-data-length", description = "Hash Data Length")
    private long hashDataLength = 2000;

    @Parameter(names = "--hashing-algo", description = "Hashing Algorithm")
    private String hashingAlgorithm = "SHA-1";

    @Parameter(names = "--exit-timeout", description = "Exit Timeout in Seconds (Default 2 minutes. Use 0 to run forever)")
    private int exitTimeoutInSeconds = 2 * 60;

    @Override
    public void start() {
        System.out.println("Starting Application...");
        Utils.exitApplication(exitTimeoutInSeconds);
        if (runHashing) {
            for (int i = 0; i < hashingWorkers; i++) {
                startThread(i, "Hashing", new HashingWorker(hashDataLength, hashingAlgorithm));
            }
        }
        if (runSleeping) {
            for (int i = 0; i < sleepingWorkers; i++) {
                startThread(i, "Sleeping", new SleepingWorker());
            }
        }
        if (runMath) {
            for (int i = 0; i < mathWorkers; i++) {
                startThread(i, "Math", new MathWorker());
            }
        }
    }

    private void startThread(int i, String name, Runnable worker) {
        Thread thread = new Thread(worker);
        thread.setName(String.format("Thread %d: %s", i, name));
        thread.start();
    }

    @Override
    public String toString() {
        return "HighCpuApplication{" +
                "runHashing=" + runHashing +
                ", runSleeping=" + runSleeping +
                ", runMath=" + runMath +
                ", hashingWorkers=" + hashingWorkers +
                ", sleepingWorkers=" + sleepingWorkers +
                ", mathWorkers=" + mathWorkers +
                ", hashDataLength=" + hashDataLength +
                ", hashingAlgorithm='" + hashingAlgorithm + '\'' +
                ", exitTimeoutInSeconds=" + exitTimeoutInSeconds +
                '}';
    }
}
