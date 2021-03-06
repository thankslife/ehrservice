/*
 * Copyright (c) 2015 Christian Chevalley
 * This file is part of Project Ethercis
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

package com.ethercis.ehr.keyvalues.serializer;

import org.openehr.rm.datatypes.quantity.DvInterval;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by christian on 5/17/2017.
 */
public class SerializeDvInterval implements I_EcisFlatSerializer{

    DvInterval dvInterval;

    public SerializeDvInterval(DvInterval dvInterval) {
        this.dvInterval = dvInterval;
    }

    @Override
    public Map<String, String> valueMap(String path, Map<String, Object> map) {
        Map<String, String> retMap = new TreeMap<>();
        String lowerValue = (dvInterval.getLower() != null ? dvInterval.getLower().toString() : "[null]");
        String upperValue = (dvInterval.getUpper() != null ? dvInterval.getUpper().toString() : "[null]");
        retMap.put(path, lowerValue +"::"+upperValue);
        return retMap;
    }
}
