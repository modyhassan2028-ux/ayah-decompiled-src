package com.ayah.dao.realm.model.quran;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public class Verse extends RealmObject implements com_ayah_dao_realm_model_quran_VerseRealmProxyInterface {
    private Chapter chapter;
    private String hafsSmartText;
    private RealmList<VerseHighlight> highlights1405;
    private RealmList<VerseHighlight> highlights1441;

    @Index
    private String humanReadableID;
    private VerseMarker marker1405;
    private VerseMarker marker1441;

    @Index
    private long number;
    private Page page1405;
    private Page page1441;
    private Part part;
    private Quarter quarter;

    @Index
    private String searchableText;
    private Section section;
    private String text;
    private String textWithoutTashkil;
    private String uthmanicHafsText;

    @PrimaryKey
    private long verseID;

    /* JADX WARN: Multi-variable type inference failed */
    public Verse() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$humanReadableID("");
        realmSet$text("");
        realmSet$textWithoutTashkil("");
        realmSet$uthmanicHafsText("");
        realmSet$hafsSmartText("");
        realmSet$searchableText("");
        realmSet$highlights1405(new RealmList());
        realmSet$highlights1441(new RealmList());
    }

    public final Chapter getChapter() {
        return realmGet$chapter();
    }

    public final String getHafsSmartText() {
        return realmGet$hafsSmartText();
    }

    public final RealmList<VerseHighlight> getHighlights1405() {
        return realmGet$highlights1405();
    }

    public final RealmList<VerseHighlight> getHighlights1441() {
        return realmGet$highlights1441();
    }

    public final String getHumanReadableID() {
        return realmGet$humanReadableID();
    }

    public final VerseMarker getMarker1405() {
        return realmGet$marker1405();
    }

    public final VerseMarker getMarker1441() {
        return realmGet$marker1441();
    }

    public final long getNumber() {
        return realmGet$number();
    }

    public final Page getPage1405() {
        return realmGet$page1405();
    }

    public final Page getPage1441() {
        return realmGet$page1441();
    }

    public final Part getPart() {
        return realmGet$part();
    }

    public final Quarter getQuarter() {
        return realmGet$quarter();
    }

    public final String getSearchableText() {
        return realmGet$searchableText();
    }

    public final Section getSection() {
        return realmGet$section();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final String getTextWithoutTashkil() {
        return realmGet$textWithoutTashkil();
    }

    public final String getUthmanicHafsText() {
        return realmGet$uthmanicHafsText();
    }

    public final long getVerseID() {
        return realmGet$verseID();
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Chapter realmGet$chapter() {
        return this.chapter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$hafsSmartText() {
        return this.hafsSmartText;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public RealmList realmGet$highlights1405() {
        return this.highlights1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public RealmList realmGet$highlights1441() {
        return this.highlights1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$humanReadableID() {
        return this.humanReadableID;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public VerseMarker realmGet$marker1405() {
        return this.marker1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public VerseMarker realmGet$marker1441() {
        return this.marker1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public long realmGet$number() {
        return this.number;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Page realmGet$page1405() {
        return this.page1405;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Page realmGet$page1441() {
        return this.page1441;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Part realmGet$part() {
        return this.part;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Quarter realmGet$quarter() {
        return this.quarter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$searchableText() {
        return this.searchableText;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public Section realmGet$section() {
        return this.section;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$textWithoutTashkil() {
        return this.textWithoutTashkil;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public String realmGet$uthmanicHafsText() {
        return this.uthmanicHafsText;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public long realmGet$verseID() {
        return this.verseID;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$chapter(Chapter chapter) {
        this.chapter = chapter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$hafsSmartText(String str) {
        this.hafsSmartText = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$highlights1405(RealmList realmList) {
        this.highlights1405 = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$highlights1441(RealmList realmList) {
        this.highlights1441 = realmList;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$humanReadableID(String str) {
        this.humanReadableID = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$marker1405(VerseMarker verseMarker) {
        this.marker1405 = verseMarker;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$marker1441(VerseMarker verseMarker) {
        this.marker1441 = verseMarker;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$number(long j) {
        this.number = j;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$page1405(Page page) {
        this.page1405 = page;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$page1441(Page page) {
        this.page1441 = page;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$part(Part part) {
        this.part = part;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$quarter(Quarter quarter) {
        this.quarter = quarter;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$searchableText(String str) {
        this.searchableText = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$section(Section section) {
        this.section = section;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$textWithoutTashkil(String str) {
        this.textWithoutTashkil = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$uthmanicHafsText(String str) {
        this.uthmanicHafsText = str;
    }

    @Override // io.realm.com_ayah_dao_realm_model_quran_VerseRealmProxyInterface
    public void realmSet$verseID(long j) {
        this.verseID = j;
    }

    public final void setChapter(Chapter chapter) {
        realmSet$chapter(chapter);
    }

    public final void setHafsSmartText(String str) {
        j.e(str, "<set-?>");
        realmSet$hafsSmartText(str);
    }

    public final void setHighlights1405(RealmList<VerseHighlight> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$highlights1405(realmList);
    }

    public final void setHighlights1441(RealmList<VerseHighlight> realmList) {
        j.e(realmList, "<set-?>");
        realmSet$highlights1441(realmList);
    }

    public final void setHumanReadableID(String str) {
        j.e(str, "<set-?>");
        realmSet$humanReadableID(str);
    }

    public final void setMarker1405(VerseMarker verseMarker) {
        realmSet$marker1405(verseMarker);
    }

    public final void setMarker1441(VerseMarker verseMarker) {
        realmSet$marker1441(verseMarker);
    }

    public final void setNumber(long j) {
        realmSet$number(j);
    }

    public final void setPage1405(Page page) {
        realmSet$page1405(page);
    }

    public final void setPage1441(Page page) {
        realmSet$page1441(page);
    }

    public final void setPart(Part part) {
        realmSet$part(part);
    }

    public final void setQuarter(Quarter quarter) {
        realmSet$quarter(quarter);
    }

    public final void setSearchableText(String str) {
        j.e(str, "<set-?>");
        realmSet$searchableText(str);
    }

    public final void setSection(Section section) {
        realmSet$section(section);
    }

    public final void setText(String str) {
        j.e(str, "<set-?>");
        realmSet$text(str);
    }

    public final void setTextWithoutTashkil(String str) {
        j.e(str, "<set-?>");
        realmSet$textWithoutTashkil(str);
    }

    public final void setUthmanicHafsText(String str) {
        j.e(str, "<set-?>");
        realmSet$uthmanicHafsText(str);
    }

    public final void setVerseID(long j) {
        realmSet$verseID(j);
    }
}
