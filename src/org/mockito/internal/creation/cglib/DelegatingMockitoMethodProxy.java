/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.creation.cglib;

import org.mockito.cglib.proxy.MethodProxy;

class DelegatingMockitoMethodProxy extends AbstractMockitoMethodProxy {

    private final MethodProxy methodProxy;

    public DelegatingMockitoMethodProxy(MethodProxy methodProxy) {
        this.methodProxy = methodProxy;
    }

    public MethodProxy getMethodProxy() {
        return methodProxy;
    }
}