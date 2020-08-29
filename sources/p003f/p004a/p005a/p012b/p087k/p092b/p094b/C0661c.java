package p003f.p004a.p005a.p012b.p087k.p092b.p094b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002es.gob.radarcovid.models.domain.Answer;
import p002es.gob.radarcovid.models.domain.Question;
import p003f.p004a.p005a.p012b.p087k.p092b.p095c.C0666c;
import p003f.p004a.p005a.p108g.p114c.p115p.C0855a;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b;
import p003f.p004a.p005a.p108g.p114c.p115p.C0857b.C0859b;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4552e;
import p392u.C4560l;
import p392u.p401r.p402b.C4618l;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;

/* renamed from: f.a.a.b.k.b.b.c */
public final class C0661c extends C4639i implements C4618l<List<? extends Question>, C4560l> {

    /* renamed from: f */
    public final /* synthetic */ C0663e f2097f;

    public C0661c(C0663e eVar) {
        this.f2097f = eVar;
        super(1);
    }

    /* renamed from: b */
    public Object mo3153b(Object obj) {
        C0859b bVar;
        ArrayList arrayList;
        List<Question> list = (List) obj;
        if (list != null) {
            C0663e eVar = this.f2097f;
            if (eVar.f2104f != null) {
                int i = 10;
                ArrayList arrayList2 = new ArrayList(C2286e.m5158a((Iterable<? extends T>) list, 10));
                for (Question question : list) {
                    int id = question.getId();
                    int ordinal = question.getType().ordinal();
                    if (ordinal == 0) {
                        bVar = C0859b.RATE;
                    } else if (ordinal == 1) {
                        bVar = C0859b.SINGLE_SELECTION;
                    } else if (ordinal == 2) {
                        bVar = C0859b.MULTIPLE_SELECTION;
                    } else if (ordinal == 3) {
                        bVar = C0859b.FIELD;
                    } else {
                        throw new C4552e();
                    }
                    C0859b bVar2 = bVar;
                    String question2 = question.getQuestion();
                    if (question.getType().ordinal() != 0) {
                        List<Answer> answers = question.getAnswers();
                        arrayList = new ArrayList(C2286e.m5158a((Iterable<? extends T>) answers, i));
                        for (Answer answer : answers) {
                            arrayList.add(new C0855a(answer.getId(), answer.getAnswer(), false, 4));
                        }
                    } else {
                        int minValue = question.getMinValue();
                        int maxValue = question.getMaxValue();
                        ArrayList arrayList3 = new ArrayList();
                        if (minValue <= maxValue) {
                            while (true) {
                                arrayList3.add(new C0855a(minValue, String.valueOf(minValue), false, 4));
                                if (minValue == maxValue) {
                                    break;
                                }
                                minValue++;
                            }
                        }
                        arrayList = arrayList3;
                    }
                    Integer parentQuestionId = question.getParentQuestionId();
                    int intValue = parentQuestionId != null ? parentQuestionId.intValue() : -1;
                    Integer parentAnswerId = question.getParentAnswerId();
                    C0857b bVar3 = r9;
                    C0857b bVar4 = new C0857b(id, bVar2, question2, arrayList, intValue, parentAnswerId != null ? parentAnswerId.intValue() : -1, question.getMinValue(), question.getMaxValue());
                    arrayList2.add(bVar3);
                    i = 10;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((C0857b) next).mo3953a()) {
                        arrayList4.add(next);
                    }
                }
                eVar.f2099a = arrayList4;
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (!((C0857b) next2).mo3953a()) {
                        arrayList5.add(next2);
                    }
                }
                eVar.f2100b = arrayList5;
                C0666c cVar = eVar.f2101c;
                List<C0857b> list2 = eVar.f2099a;
                String str = "parentQuestions";
                if (list2 != null) {
                    boolean z = list2.size() == 1;
                    List<C0857b> list3 = eVar.f2099a;
                    if (list3 != null) {
                        cVar.mo3198a(z, (C0857b) list3.get(0));
                        C0666c cVar2 = eVar.f2101c;
                        List<C0857b> list4 = eVar.f2099a;
                        if (list4 != null) {
                            cVar2.mo3196a(1, list4.size());
                            this.f2097f.f2101c.mo3195K();
                            this.f2097f.f2101c.mo3945v();
                            return C4560l.f10773a;
                        }
                        C4638h.m10273b(str);
                        throw null;
                    }
                    C4638h.m10273b(str);
                    throw null;
                }
                C4638h.m10273b(str);
                throw null;
            }
            throw null;
        }
        C4638h.m10271a("it");
        throw null;
    }
}
