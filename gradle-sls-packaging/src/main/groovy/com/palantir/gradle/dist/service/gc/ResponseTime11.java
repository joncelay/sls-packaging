/*
 * (c) Copyright 2018 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.gradle.dist.service.gc;

import com.google.common.collect.ImmutableList;
import java.util.List;

public final class ResponseTime11 implements GcProfile {
    @Override
    public List<String> gcJvmOpts() {
        return ImmutableList.of(
                // https://wiki.openjdk.java.net/display/shenandoah/Main
                "-XX:+UseShenandoahGC",
                // "forces concurrent cycle instead of Full GC on System.gc()"
                "-XX:+ExplicitGCInvokesConcurrent",
                "-XX:+ClassUnloadingWithConcurrentMark");
    }
}