package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Page extends RealmObject implements com_ayah_dao_realm_model_quran_PageRealmProxyInterface {
    private RealmList<ChapterHeader> chapterHeaders1405;
    private RealmList<ChapterHeader> chapterHeaders1441;
    private PageHeader header1405;
    private PageHeader header1441;

    @PrimaryKey
    private long identifier;
    private boolean isRight;

    @Index
    private long number;
    private RealmList<Verse> verses1405;
    private RealmList<Verse> verses1441;

    /* JADX WARN: Multi-variable type inference failed */
    public Page() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$chapterHeaders1405(new RealmList());
        realmSet$chapterHeaders1441(new RealmList());
        realmSet$verses1405(new RealmList());
        realmSet$verses1441(new RealmList());
    }

    public final RealmList<ChapterHeader> getChapterHeaders1405() {
        return realmGet$chapterHeaders1405();
    }

    public final RealmList<ChapterHeader> getChapterHeaders1441() {
        return realmGet$chapterHeaders1441();
    }

    public final PageHeader getHeader1405() {
        return realmGet$header1405();
    }

    public final PageHeader getHeader1441() {
        return realmGet$header1441();
    }

    public final long getIdentifier() {
        return realmGet$identifier();
    }

    public final long getNumber() {
        return realmGet$number();
    }

    public final RealmList<Verse> getVerses1405() {
        return realmGet$verses1405();
    }

    public final RealmList<Verse> getVerses1441() {
        return realmGet$verses1441();
    }

    public final boolean isRight() {
        return realmGet$isRight();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList realmGet$chapterHeaders1405() {
        return this.chapterHeaders1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList realmGet$chapterHeaders1441() {
        return this.chapterHeaders1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public PageHeader realmGet$header1405() {
        return this.header1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public PageHeader realmGet$header1441() {
        return this.header1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public long realmGet$identifier() {
        return this.identifier;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public boolean realmGet$isRight() {
        return this.isRight;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public long realmGet$number() {
        return this.number;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList realmGet$verses1405() {
        return this.verses1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public RealmList realmGet$verses1441() {
        return this.verses1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$chapterHeaders1405(RealmList realmList) {
        this.chapterHeaders1405 = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$chapterHeaders1441(RealmList realmList) {
        this.chapterHeaders1441 = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$header1405(PageHeader pageHeader) {
        this.header1405 = pageHeader;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$header1441(PageHeader pageHeader) {
        this.header1441 = pageHeader;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$identifier(long j) {
        this.identifier = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$isRight(boolean z10) {
        this.isRight = z10;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$number(long j) {
        this.number = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$verses1405(RealmList realmList) {
        this.verses1405 = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_PageRealmProxyInterface
    public void realmSet$verses1441(RealmList realmList) {
        this.verses1441 = realmList;
    }

    public final void setChapterHeaders1405(RealmList<ChapterHeader> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$chapterHeaders1405(realmList);
    }

    public final void setChapterHeaders1441(RealmList<ChapterHeader> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$chapterHeaders1441(realmList);
    }

    public final void setHeader1405(PageHeader pageHeader) {
        realmSet$header1405(pageHeader);
    }

    public final void setHeader1441(PageHeader pageHeader) {
        realmSet$header1441(pageHeader);
    }

    public final void setIdentifier(long j) {
        realmSet$identifier(j);
    }

    public final void setNumber(long j) {
        realmSet$number(j);
    }

    public final void setRight(boolean z10) {
        realmSet$isRight(z10);
    }

    public final void setVerses1405(RealmList<Verse> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$verses1405(realmList);
    }

    public final void setVerses1441(RealmList<Verse> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$verses1441(realmList);
    }
}
