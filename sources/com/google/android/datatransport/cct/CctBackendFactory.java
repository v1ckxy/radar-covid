package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p213q.p217b.p218a.p219a.p220e.C2000e;
import p213q.p217b.p218a.p219a.p222f.p223p.C2029c;
import p213q.p217b.p218a.p219a.p222f.p223p.C2030d;
import p213q.p217b.p218a.p219a.p222f.p223p.C2035h;
import p213q.p217b.p218a.p219a.p222f.p223p.C2041m;

@Keep
public class CctBackendFactory implements C2030d {
    public C2041m create(C2035h hVar) {
        C2029c cVar = (C2029c) hVar;
        return new C2000e(cVar.f5807a, cVar.f5808b, cVar.f5809c);
    }
}
