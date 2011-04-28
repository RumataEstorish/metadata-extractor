/*
 * Copyright 2002-2011 Drew Noakes
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 * More information about this project is available at:
 *
 *    http://drewnoakes.com/code/exif/
 *    http://code.google.com/p/metadata-extractor/
 */
package com.drew.lang.test;

import com.drew.lang.NullOutputStream;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.OutputStream;

/**
 * @author Drew Noakes http://drewnoakes.com
 */
public class NullOutputStreamTest
{
    @Test
    public void testCreateNullOutputStream() throws Exception
    {
        OutputStream out = new NullOutputStream();
        out.write(1);
    }
}