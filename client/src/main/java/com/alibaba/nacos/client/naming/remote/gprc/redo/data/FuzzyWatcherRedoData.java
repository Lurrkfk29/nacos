/*
 * Copyright 1999-2023 Alibaba Group Holding Ltd.
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

package com.alibaba.nacos.client.naming.remote.gprc.redo.data;

/**
 * Redo data for fuzzy watcher.
 *
 * @author tanyongquan
 */
public class FuzzyWatcherRedoData extends RedoData<String> {
    
    private FuzzyWatcherRedoData(String serviceNamePattern, String groupNamePattern) {
        super(serviceNamePattern, groupNamePattern);
    }
    
    public static FuzzyWatcherRedoData build(String serviceNamePattern, String groupNamePattern) {
        return new FuzzyWatcherRedoData(serviceNamePattern, groupNamePattern);
    }
}