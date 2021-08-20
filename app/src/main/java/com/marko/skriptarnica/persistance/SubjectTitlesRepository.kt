package com.marko.skriptarnica.persistance

class SubjectTitlesRepository {
    private val titlesStrucni = listOf(
        "Računarstvo stručni 1. godina",
        "Računarstvo stručni 2. godina",
        "Računarstvo stručni 3. godina",
        "Automatika 1. godina",
        "Automatika 2. godina",
        "Automatika 3. godina",
        "Elektroenergetika 1. godina",
        "Elektroenergetika 2. godina",
        "Elektroenergetika 3. godina"
    )

    private val titlesPredDipl = listOf(
        "Elektrotehnika 1. godina",
        "Elektrotehnika 2. godina EE",
        "Elektrotehnika 2. godina KI",
        "Elektrotehnika 3. godina EE",
        "Elektrotehnika 3. godina KI",
        "Računarstvo 1. godina",
        "Računarstvo 2. godina",
        "Računarstvo 3. godina"
    )

    private val titlesDipl = listOf(
        "Računalno inženjerstvo 1. godina",
        "Računalno inženjerstvo 2. godina",
        "Robotika i umjetna inteligencija 1. godina",
        "Robotika i umjetna inteligencija 2. godina",
        "Programsko inženjerstvo 1. godina",
        "Programsko inženjerstvo 2. godina",
        "Informacijske i podatkovne znanosti 1. godina",
        "Informacijske i podatkovne znanosti 2. godina",
        "Komunikacijske tehnologije 1. godina",
        "Komunikacijske tehnologije 2. godina",
        "Mrežne tehnologije 1. godina",
        "Mrežne tehnologije 2. godina",
        "Elektroenergetski sustavi 1. godina",
        "Elektroenergetski sustavi 2. godina",
        "Održiva elektroenergetika 1. godina",
        "Održiva elektroenergetika 2. godina",
        "Industrijska elektroenergetika 1. godina",
        "Industrijska elektroenergetika 2. godina",
        "Automobilsko računarstvo i komunikacije na engleskom jeziku 1. godina",
        "Automobilsko računarstvo i komunikacije na engleskom jeziku 2. godina",
        "Automobilsko računarstvo i komunikacije 1. godina",
        "Automobilsko računarstvo i komunikacije 2. godina"
    )

    private val titlesRacunarstvo1 = listOf(
        "Fizika",
        "Inžinjerska grafika",
        "Engleski jezik 1",
        "Njemački jezik 1",
        "Osnove elektrotehnike",
        "Programiranje 1",
        "Matematika za računarstvo 1",
        "Osnove elektronike",
        "Engleski jezik 2",
        "Njemački jezik 2",
        "Poslovno komuniciranje",
        "Programiranje 2",
        "Matematika za računarstvo 2"
    )

    private val titlesAutomatika1 = listOf(
        "Fizika",
        "Inžinjerska grafika",
        "Engleski jezik 1",
        "Njemački jezik 1",
        "Osnove elektrotehnike 1",
        "Programiranje",
        "Matematika 1",
        "Osnove elektronike",
        "Engleski jezik 2",
        "Njemački jezik 2",
        "Poslovno komuniciranje",
        "Osnove elektrotehnike 2",
        "Matematika 2"
    )

    private val titlesElektroenergetika1 = listOf(
        "Fizika",
        "Inžinjerska grafika",
        "Engleski jezik 1",
        "Njemački jezik 1",
        "Osnove elektrotehnike 1",
        "Programiranje",
        "Matematika 1",
        "Osnove elektronike",
        "Engleski jezik 2",
        "Njemački jezik 2",
        "Poslovno komuniciranje",
        "Osnove elektrotehnike 2",
        "Matematika 2"
    )

    private val titlesPredDiplProgIng1 = listOf(
        "Osnove elektrotehnike i elektronike",
        "Linearna algebra",
        "Matematika 1",
        "Inženjerska grafika i dokumentiranje",
        "Programiranje 1",
        "Matematičke osnove računarstva",
        "Engleski jezik",
        "Ekonomika poduzeća",
        "Komunikacijske vještine",
        "Digitalna elektronika",
        "Matematika 2",
        "Programiranje 2"
    )

    private val titlesPredDiplRacIng1 = listOf(
        "Osnove elektrotehnike",
        "Linearna algebra",
        "Matematika 1",
        "Inženjerska grafika i dokumentiranje",
        "Programiranje 1",
        "Matematičke osnove računarstva",
        "Engleski jezik",
        "Elektronika 1",
        "Fizika",
        "Digitalna elektronika",
        "Matematika 2",
        "Programiranje 2"
    )

    private val titlesPredDiplEleInfTeh1 = listOf(
        "Linearna algebra",
        "Matematika 1",
        "Osnove elektrotehnike 1",
        "Inženjerska grafika i dokumentiranje",
        "Programiranje 1",
        "Fizika 1",
        "Engleski jezik",
        "Matematika 2",
        "Osnove elektrotehnike 2",
        "Elektronika 1",
        "Programiranje 2",
        "Fizika 2"
    )

    private val titlesRacunarstvo2 = listOf(
        "Matematička statistika",
        "Digitalna elektronika",
        "Arhitektura računalnih sustava",
        "Programiranje u Javi",
        "Uvod u diskretnu matematiku",
        "Računalna grafika",
        "Jezici za opisivanje sklopovlja",
        "Programiranje malih Linux računala",
        "Osnove 3D modeliranja",
        "Informacijski sustavi i računalne mreže",
        "Operacijski sustavi",
        "Baze podataka",
        "Algoritmi i strukture podataka",
        "Projekti za društveno korisno učenje",
        "Algoritmi s grafovima",
        "Dizajn u objektno orijentiranom programiranju",
        "Mikroračunalni sustavi",
        "Primijenjeno strojno učenje"
    )

    private val titlesAutomatika2 = listOf(
        "Matematička statistika",
        "Osnove automatske regulacije",
        "Digitalna elektronika",
        "Arhitektura računalnih sustava",
        "Osnove energetike",
        "Uvod u diskretnu matematiku",
        "Električni strojevi i pogoni",
        "Materijali i tehnološki postupci",
        "Mjerenja u elektrotehnici",
        "Informacijski sustavi i računalne mreže",
        "Energetska elektronika",
        "Projekti za društveno korisno učenje",
        "Recikliranje elektrotehničkih proizvoda",
        "Elektronička mjerenja i instrumentacija"
    )

    private val titlesElektroenergetika2 = listOf(
        "Matematička statistika",
        "Osnove električnih strojeva",
        "Električne instalacije i rasvjeta",
        "Osnove energetike",
        "Osnove automatske regulacije",
        "Arhitektura računalnih sustava",
        "Uvod u diskretnu matematiku",
        "Sklopni aparati",
        "Materijali i tehnološki postupci",
        "Mjerenja u elektrotehnici",
        "Transformatori i električni rotacijski strojevi",
        "Energetska elektronika",
        "Projekti za društveno korisno učenje",
        "Recikliranje elektrotehničkih proizvoda",
        "Elektronička mjerenja i instrumentacija",
        "Programski alati u elektroenergetici"
    )

    private val titlesPredDiplRac1 = listOf(
        "Linearna algebra",
        "Matematika 1",
        "Osnove elektrotehnike 1",
        "Inženjerska grafika i dokumentiranje",
        "Programiranje 1",
        "Matematičke osnove računarstva",
        "Engleski jezik",
        "Matematika 2",
        "Osnove elektrotehnike 2",
        "Elektronika 1",
        "Programiranje 2",
        "Fizika"
    )

    private val titlesPredDiplRac2 = listOf(
        "Matematika 3",
        "Algoritmi i strukture podataka",
        "Operacijski sustavi",
        "Digitalna elektronika",
        "Objektno orijentirano programiranje",
        "Engleski jezik",
        "Komunikacijske mreže",
        "Vjerojatnost i statistika",
        "Signali i sustavi",
        "Engleski jezik 1",
        "Razvoj programske podrške objektno orijentiranim načelima",
        "Teorija informacije"
    )

    private val titlesPredDiplEleInfTeh2EE = listOf(
        "Matematika 3",
        "Energetske pretvorbe",
        "Materijali u elektrotehnici",
        "Osnove energetike i ekologije",
        "Osnove mjerenja"
    )

    private val titlesPredDiplEleInfTeh2KI = listOf(
        "Matematika 3",
        "Osnove mjerenja",
        "Elektronika 2",
        "Digitalna elektronika",
        "Objektno orijentirano programiranje",
        "Engleski jezik"
    )

    private val titlesAutomatika3 = listOf(
        "Uvod u ekonomiku i management",
        "Automatsko upravljanje",
        "Mikroračunala u automatizaciji",
        "Programsko inženjerstvo",
        "Procesna mjerenja, senzori i aktori",
        "Programiranje FPGA",
        "Industrijska informatika i automatizacija",
        "Projekti za društveno korisno učenje",
        "Uvod u robotiku i inteligentno upravljanje",
        "Mali i specijalni električni strojevi",
        "Njemački jezik"
    )

    private val titlesElektroenergetika3 = listOf(
        "Uvod u ekonomiku i management",
        "Elektroenergetska postrojenja",
        "Elektroenergetske mreže i vodovi",
        "Elektrane i elektroenergetski sustav",
        "Elektromotorni pogoni",
        "Tehnologije obnovljivih izvora energije",
        "Prijenos i distribucija električne energije",
        "Projekti za društveno korisno učenje",
        "Mali i specijalni električni strojevi",
        "Zaštita u elektroenergetskom sustavu",
        "Provedba energetskog pregleda",
        "Njemački jezik"
    )

    private val titlesRacunarstvo3 = listOf(
        "Uvod u ekonomiku i management",
        "Programsko inženjerstvo",
        "Web programiranje",
        "Digitalne komunikacije",
        "Multimedijska tehnika",
        "Razvoj mobilnih aplikacija",
        "Informacijska sigurnost",
        "Industrijska informatika i automatizacija",
        "Projekti za društveno korisno učenje",
        "Dizajn korisničkog sučelja",
        "Internet objekata",
        "Oblikovanje baza podataka",
        "Primjena blockchain tehnologije",
        "Njemački jezik"
    )

    private val titlesPredDiplEleInfTeh3EE = listOf(
        "Engleski jezik 2",
        "Osnove električnih pogona",
        "Osnove elektroenergetskog sustava",
        "Osnove energetske elektronike",
        "Osnove automatskog upravljanja",
        "Ekonomika poduzeća",
        "Komunikacijske vještine",
        "Engleski jezik 3",
        "Električne instalacije i rasvjeta"
    )

    private val titlesPredDiplEleInfTeh3KI = listOf(
        "Engleski jezik 2",
        "Komunikacijski sustavi",
        "Baze podataka",
        "Arhitektura računala",
        "Osnove razvoja web i mobilnih aplikacija",
        "Ekonomika poduzeća",
        "Komunikacijske vještine",
        "Engleski jezik 3",
        "Projektiranje tehničkih sustava"
    )

    private val titlesPredDiplRac3 = listOf(
        "Engleski jezik 2",
        "Osnove automatskog upravljanja",
        "Baze podataka",
        "Arhitektura računala",
        "Osnove razvoja web i mobilnih aplikacija",
        "Ekonomika poduzeća",
        "Komunikacijske vještine",
        "Engleski jezik 3",
        "Modeliranje i simulacija"
    )

    private val titlesRacIng1 = listOf(
        "Dizajn računalnih sustava",
        "Automati i formalni jezici",
        "Algoritmi i arhitektura DSP-a",
        "Upravljanje procesima",
        "Metode i tehnike testiranja programske podrške",
        "Ugradbeni računalni sustavi",
        "Računalni sustavi stvarnog vremena",
        "Sveprisutno računarstvo",
        "Projektiranje računalnih mreža",
        "Inteligentni sustavi"
    )

    private val titlesRacIng2 = listOf(
        "Pouzdanost i dijagnostika rač. sustava",
        "Osiguranje kakvoće programske podrške",
        "Raspodijeljeni računalni sustavi",
        "Menadžment",
        "Upravljanje projektima",
        "Inteligentni transportni sustavi",
        "Digitalna videotehnika",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Napredno Web programiranje",
        "Zeleno računarstvo",
        "3D računalna grafika",
        "Robotski vid",
        "Sonarsko računarstvo",
        "Šah i računala",
        "Diskretna matematika",
        "Blockchain tehnologija i kriptovalute",
        "Integracija digitalnih sustava",
        "Njemački jezik"
    )

    private val titlesRobotika1 = listOf(
        "Dizajn računalnih sustava",
        "Automati i formalni jezici",
        "Upravljanje procesima",
        "Računalna geometrija i robotski vid",
        "Raspoznavanje uzoraka i strojno učenje",
        "Ugradbeni računalni sustavi",
        "Računalni sustavi stvarnog vremena",
        "Inteligentni sustavi",
        "Meko računarstvo",
        "Osnove robotike"
    )

    private val titlesRobotika2 = listOf(
        "Pouzdanost i dijagnostika rač. sustava",
        "Modeliranje temeljeno na podacima",
        "Industrijska informatika",
        "Menadžment",
        "Upravljanje projektima",
        "Inteligentni transportni sustavi",
        "Digitalna videotehnika",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Napredno Web programiranje",
        "Zeleno računarstvo",
        "3D računalna grafika",
        "Robotski vid",
        "Sonarsko računarstvo",
        "Šah i računala",
        "Diskretna matematika",
        "Blockchain tehnologija i kriptovalute",
        "Programiranje robota",
        "Njemački jezik"
    )

    private val titlesProgIng1 = listOf(
        "Dizajn računalnih sustava",
        "Automati i formalni jezici",
        "Metode i tehnike testiranja programske podrške",
        "Modeliranje i dizajn programskih sustava",
        "Računarstvo usluga i analiza podataka",
        "Računalni sustavi stvarnog vremena",
        "Sistemsko programiranje",
        "Vizualizacija podataka",
        "Web programiranje",
        "Razvoj mobilnih aplikacija"
    )

    private val titlesProgIng2 = listOf(
        "Pouzdanost i dijagnostika rač. sustava",
        "Stručna praksa iz računarstva",
        "Osiguranje kakvoće programske podrške",
        "Raspodijeljeni računalni sustavi",
        "Menadžment",
        "Upravljanje projektima",
        "Inteligentni transportni sustavi",
        "Digitalna videotehnika",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Napredno Web programiranje",
        "Zeleno računarstvo",
        "3D računalna grafika",
        "Robotski vid",
        "Sonarsko računarstvo",
        "Šah i računala",
        "Diskretna matematika",
        "Blockchain tehnologija i kriptovalute",
        "Njemački jezik"
    )

    private val titlesInfPodZnanosti1 = listOf(
        "Dizajn računalnih sustava",
        "Automati i formalni jezici",
        "Raspoznavanje uzoraka i strojno učenje",
        "Računarstvo usluga i analiza podataka",
        "Obrada slike i računalni vid",
        "Računalni sustavi stvarnog vremena",
        "Sistemsko programiranje",
        "Vizualizacija podataka",
        "Web programiranje",
        "Razvoj računalnih igara"
    )

    private val titlesInfPodZnanosti2 = listOf(
        "Pouzdanost i dijagnostika rač. sustava",
        "Raspodijeljeni računalni sustavi",
        "Internet objekata",
        "Menadžment",
        "Upravljanje projektima",
        "Inteligentni transportni sustavi",
        "Digitalna videotehnika",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Napredno Web programiranje",
        "Zeleno računarstvo",
        "3D računalna grafika",
        "Robotski vid",
        "Sonarsko računarstvo",
        "Šah i računala",
        "Diskretna matematika",
        "Blockchain tehnologija i kriptovalute",
        "Njemački jezik"
    )

    private val titlesKomTeh1 = listOf(
        "Napredno programiranje",
        "Elektromagnetska polja i valovi",
        "Mreže računala",
        "Numerička matematika",
        "Mikroelektronika",
        "Multimedijski sustavi",
        "Predajnici",
        "Radio-relejne i satelitske komunikacije",
        "Antene",
        "Optoelektroničke komunikacije"
    )

    private val titlesKomTeh2 = listOf(
        "Mobilne komunikacije",
        "Prijemnici",
        "Primjena mikroupravljačkih sustava",
        "Menadžment",
        "Upravljanje projektima",
        "Inteligentni transportni sustavi",
        "Digitalna videotehnika",
        "Projekti za društveno korisno učenje",
        "Napredno Web programiranje",
        "Zeleno računarstvo",
        "Projektiranje računalnih mreža",
        "Njemački jezik"
    )

    private val titlesMrezneTeh1 = listOf(
        "Napredno programiranje",
        "Elektromagnetska polja i valovi",
        "Mreže računala",
        "Digitalna obrada signala",
        "Kodovi i kodiranje",
        "Objektno programiranje",
        "Multimedijski sustavi",
        "Sigurnost računalnih sustava",
        "Web programiranje",
        "Razvoj mobilnih aplikacija"
    )

    private val titlesMrezneTeh2 = listOf(
        "Mobilne komunikacije",
        "Komunikacijski protokoli",
        "Internet objekata",
        "Menadžment",
        "Upravljanje projektima",
        "Inteligentni transportni sustavi",
        "Digitalna videotehnika",
        "Projekti za društveno korisno učenje",
        "Napredno Web programiranje",
        "Zeleno računarstvo",
        "Projektiranje računalnih mreža",
        "Njemački jezik"
    )

    private val titlesElektroenergSustavi1 = listOf(
        "Električni strojevi",
        "Elektroenergetski transformatori",
        "Ekonomika i tržište električne energije",
        "Analiza elektroenergetskog sustava",
        "Elektroenergetska postrojenja",
        "Elektrane",
        "Stabilnost i prijelazni procesi u elektroenergetskom sustavu",
        "Sklopni aparati i visokonaponska tehnika",
        "Kvaliteta i pouzdanost u elektroenergetskom sustavu",
        "Prijenos i distribucija električne energije"
    )

    private val titlesElektroenergSustavi2 = listOf(
        "Zaštita u elektroenergetskom sustavu",
        "Koordinacija zaštite aktivnih elektroenergetskih mreža",
        "Vođenje elektroenergetskog sustava",
        "Menadžment",
        "Upravljanje projektima",
        "Energetski pregledi i javna rasvjeta",
        "Numeričke metode u elektromagnetizmu",
        "Planiranje pogona EES",
        "Pohrana i reverzibilnost energije",
        "Sustavi neprekidnog napajanja",
        "Uzemljivači i sustavi uzemljenja",
        "Toplinske primjene obnovljivih izvora energije",
        "Elektroenergetski vodovi",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Njemački jezik"
    )

    private val titlesOdrzivaElektroenergetika1 = listOf(
        "Električni strojevi",
        "Analiza elektroenergetskog sustava",
        "Elektroenergetska postrojenja",
        "Energetska učinkovitost",
        "Energetska učinkovitost električnih sustava",
        "Primijenjena energetska elektronika",
        "Elektrane",
        "Prijenos i distribucija električne energije",
        "Obnovljivi izvori električne energije",
        "Projektiranje električnih instalacija, rasvjete i postrojenja"
    )

    private val titlesOdrzivaElektroenergetika2 = listOf(
        "Zaštita u elektroenergetskom sustavu",
        "Vođenje elektroenergetskog sustava",
        "Integracija OIE i napredne mreže",
        "Menadžment",
        "Upravljanje projektima",
        "Energetski pregledi i javna rasvjeta",
        "Numeričke metode u elektromagnetizmu",
        "Planiranje pogona EES",
        "Pohrana i reverzibilnost energije",
        "Sustavi neprekidnog napajanja",
        "Uzemljivači i sustavi uzemljenja",
        "Toplinske primjene obnovljivih izvora energije",
        "Elektroenergetski vodovi",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Njemački jezik"
    )

    private val titlesIndustrijskaElektroenergetika1 = listOf(
        "Električni strojevi",
        "Primijenjeni elektromagnetizam u elektroenergetici",
        "Elektromagnetska kompatibilnost",
        "Elektromagnetska mjerenja",
        "Industrijska informatika",
        "Primijenjena energetska elektronika",
        "Elektrane",
        "Projektiranje električnih instalacija, rasvjete i postrojenja",
        "Električni pogoni",
        "Industrijska mjerenja"
    )

    private val titlesIndustrijskaElektroenergetika2 = listOf(
        "Zaštita u elektroenergetskom sustavu",
        "Elektroenergetska postrojenja",
        "Dinamika industrijskih sustava",
        "Stručna praksa iz elektrotehnike",
        "Menadžment",
        "Upravljanje projektima",
        "Energetski pregledi i javna rasvjeta",
        "Numeričke metode u elektromagnetizmu",
        "Planiranje pogona EES",
        "Pohrana i reverzibilnost energije",
        "Sustavi neprekidnog napajanja",
        "Uzemljivači i sustavi uzemljenja",
        "Toplinske primjene obnovljivih izvora energije",
        "Elektroenergetski vodovi",
        "Elementi automatike",
        "Projekti za društveno korisno učenje",
        "Njemački jezik"
    )

    private val titlesAutoRacEng1 = listOf(
        "Pogonski sustavi i napajanja za vozila",
        "Osiguranje kakvoće automobilske programske podrške",
        "Linux u ugradbenim sustavima",
        "Napredno programiranje",
        "Dizajn računalnih sustava",
        "Primijenjena energetska elektronika",
        "Računalne mreže i protokoli u automobilu",
        "Arhitektura programske podrške u sigurnosno kritičnim sustavima upravljanja",
        "Objektno programiranje",
        "Ugradbeni računalni sustavi"
    )

    private val titlesAutoRacEng2 = listOf(
        "Digitalna obrada slike i videa za autonomna vozila",
        "Strojno učenje u sustavima autonomnih i umreženih vozila",
        "Metode i tehnike ispitivanja automobilske programske podrške",
        "Sigurnost informacijskih sustava",
        "Inteligentni transportni sustavi",
        "Projektni menadžment",
        "Radar i LiDAR u autonomnim vozilima",
        "Digitalna videotehnika",
        "Njemački jezik"
    )

    private val titlesAutoRac1 = listOf(
        "Pogonski sustavi i napajanja za vozila",
        "Osiguranje kakvoće automobilske programske podrške",
        "Linux u ugradbenim sustavima",
        "Napredno programiranje",
        "Dizajn računalnih sustava",
        "Primijenjena energetska elektronika",
        "Računalne mreže i protokoli u automobilu",
        "Arhitektura programske podrške u sigurnosno kritičnim sustavima upravljanja",
        "Objektno programiranje",
        "Ugradbeni računalni sustavi"
    )

    private val titlesAutoRac2 = listOf(
        "Digitalna obrada slike i videa za autonomna vozila",
        "Strojno učenje u sustavima autonomnih i umreženih vozila",
        "Metode i tehnike ispitivanja automobilske programske podrške",
        "Sigurnost informacijskih sustava",
        "Inteligentni transportni sustavi",
        "Projektni menadžment",
        "Radar i LiDAR u autonomnim vozilima",
        "Digitalna videotehnika",
        "Njemački jezik"
    )

    fun getTitlesRacunarstvo1(): List<String> = titlesRacunarstvo1
    fun getTitlesAutomatika1(): List<String> = titlesAutomatika1
    fun getTitlesElektroenergetika1(): List<String> = titlesElektroenergetika1
    fun getTitlesPredDiplProgIng1(): List<String> = titlesPredDiplProgIng1
    fun getTItlesPredDiplRacIng1(): List<String> = titlesPredDiplRacIng1
    fun getTitlesPredDiplEleInfTeh1(): List<String> = titlesPredDiplEleInfTeh1
    fun getTitlesRacunarstvo2(): List<String> = titlesRacunarstvo2
    fun getTitlesAutomatika2(): List<String> = titlesAutomatika2
    fun getTitlesElektroenergetika2(): List<String> = titlesElektroenergetika2
    fun getTitlesPredDiplRac1(): List<String> = titlesPredDiplRac1
    fun getTitlesPredDiplRac2(): List<String> = titlesPredDiplRac2
    fun getTitlesPredDiplEleInfTeh2EE(): List<String> = titlesPredDiplEleInfTeh2EE
    fun getTitlesPredDiplEleInfTeh2KI(): List<String> = titlesPredDiplEleInfTeh2KI
    fun getTitlesAutomatika3(): List<String> = titlesAutomatika3
    fun getTitlesElektroenergetika3(): List<String> = titlesElektroenergetika3
    fun getTitlesRacunarstvo3(): List<String> = titlesRacunarstvo3
    fun getTitlesPredDiplEleInfTeh3EE(): List<String> = titlesPredDiplEleInfTeh3EE
    fun getTitlesPredDiplEleInfTeh3KI(): List<String> = titlesPredDiplEleInfTeh3KI
    fun getTitlesPredDiplRac3(): List<String> = titlesPredDiplRac3
    fun getTitlesStrucni(): List<String> = titlesStrucni
    fun getTitlesPredDipl(): List<String> = titlesPredDipl
    fun getTitlesDipl(): List<String> = titlesDipl
    fun getTitlesRacIng1(): List<String> = titlesRacIng1
    fun getTitlesRacIng2(): List<String> = titlesRacIng2
    fun getTitlesRobotika1(): List<String> = titlesRobotika1
    fun getTitlesRobotika2(): List<String> = titlesRobotika2
    fun getTitlesProgIng1(): List<String> = titlesProgIng1
    fun getTitlesProgIng2(): List<String> = titlesProgIng2
    fun getTitlesInfPodZnanosti1(): List<String> = titlesInfPodZnanosti1
    fun getTitlesInfPodZnanosti2(): List<String> = titlesInfPodZnanosti2
    fun getTitlesKomTeh1(): List<String> = titlesKomTeh1
    fun getTitlesKomTeh2(): List<String> = titlesKomTeh2
    fun getTitlesMrezneTeh1(): List<String> = titlesMrezneTeh1
    fun getTitlesMrezneTeh2(): List<String> = titlesMrezneTeh2
    fun getTitlesElektroenergSustavi1(): List<String> = titlesElektroenergSustavi1
    fun getTitlesElektroenergSustavi2(): List<String> = titlesElektroenergSustavi2
    fun getTitlesOdrzivaElektroenergetika1(): List<String> = titlesOdrzivaElektroenergetika1
    fun getTitlesOdrzivaElektroenergetika2(): List<String> = titlesOdrzivaElektroenergetika2
    fun getTitlesIndustrijskaElektroenergetika1(): List<String> = titlesIndustrijskaElektroenergetika1
    fun getTitlesIndustrijskaElektroenergetika2(): List<String> = titlesIndustrijskaElektroenergetika2
    fun getTitlesAutoRacEng1(): List<String> = titlesAutoRacEng1
    fun getTitlesAutoRacEng2(): List<String> = titlesAutoRacEng2
    fun getTitlesAutoRac1(): List<String> = titlesAutoRac1
    fun getTitlesAutoRac2(): List<String> = titlesAutoRac2
}