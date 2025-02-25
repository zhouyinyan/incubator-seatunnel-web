/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.app.common;

public enum ScriptStatusEnum {
    UNPUBLISHED(0, "unpublished"),
    PUBLISHED(1, "published"),
    DELETED(2, "deleted"),
    ;

    private final int code;
    private final String  description;

    ScriptStatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static String parse(Byte status) {
        if (status == null) {
            throw new IllegalArgumentException("status is null");
        }
        for (ScriptStatusEnum scriptStatusEnum : ScriptStatusEnum.values()) {
            if (scriptStatusEnum.getCode() == status) {
                return scriptStatusEnum.getDescription();
            }
        }
        throw new IllegalArgumentException("status is illegal");
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
