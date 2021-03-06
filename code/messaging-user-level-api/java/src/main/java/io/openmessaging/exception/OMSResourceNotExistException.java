/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.exception;

/**
 * The {@code OMSResourceNotExistException} occurs if requested resource is not exist.
 *
 * @author vintagewang@apache.org
 *
 * @version OMS 1.0
 * @since OMS 1.0
 */
public class OMSResourceNotExistException extends OMSException {
    /**
     * @see OMSException#OMSException(String, String)
     */
    public OMSResourceNotExistException(String errorCode, String message) {
        super(errorCode, message);
    }

    /**
     * @see OMSException#OMSException(String, Throwable)
     */
    public OMSResourceNotExistException(String errorCode, Throwable cause) {
        super(errorCode, cause);
    }

    /**
     * @see OMSException#OMSException(String, String, Throwable)
     */
    public OMSResourceNotExistException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
