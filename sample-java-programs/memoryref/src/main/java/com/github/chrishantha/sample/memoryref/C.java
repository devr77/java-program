/*
 * Copyright 2019 M. Isuru Tharanga Chrishantha Perera
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
package com.github.chrishantha.sample.memoryref;

public class C extends Base {

    final E e;
    final F f;

    C(B b) {
        this.e = b.e;
        f = new F();
    }

    @Override
    public long getSize() {
        return super.getSize() + f.getSize();
    }

}
