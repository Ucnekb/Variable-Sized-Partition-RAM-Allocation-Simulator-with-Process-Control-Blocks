# Variable-Sized-Partition-RAM-Allocation-Simulator-with-Process-Control-Blocks
Bu proje, "First-Fit Algoritması" kullanarak proseslerin RAM'e tahsis edilmesini simüle eden bir uygulamadır. Proje kapsamında, verilen girdi.txt dosyasındaki proses bilgileri işlenerek RAM'in durumu simüle edilir ve proseslerin Process Control Block (PCB) bilgileri yönetilir.



Uygulama çalıştığında ilk olarak “girdi.txt” adındaki dosyayı okumalıdır. “girdi.txt” dosyasında kullanıcının
çalıştırdığı programlar ve programlara ilişkin bilgiler yer almaktadır. “girdi.txt” dosyasının her bir satırında bir
programa ilişkin şu bilgiler yer almaktadır:
a. Programın ismi
b. Programın başlangıç (çalıştırılma) ve bitiş (sonlandırılma) zamanı
c. Global değişkenlerin olduğu kısmın büyüklüğü (KB)
d. Kod kısmının büyüklüğü (KB)
e. Stack kısmının büyüklüğü (KB)
f. Heap kısmının büyüklüğü (KB)
Dosyadaki her bir değer arasında bir boşluk bulunmaktadır.
Örnek: A.exe 2 22 100 213 20 20 (Bu örnekte, A.exe isimli program 2. Saniyede yüklenmiştir ve 22. Saniyede
silinmiştir, data kısmının büyüklüğü 100 KB’tır, kod kısmının büyüklüğü 213 KB’tır, stack kısmının büyüklüğü
20 KB’tır, heap kısmının büyüklüğü 20 KB’tır.
2. Proseslerin RAM’e yerleştirilmesi, bitişik hafıza atama - variable-sized partitions (farklı boyutlu bölümler) -
first fit yöntemine göre yapılmalıdır. Yani, prosesler RAM’de bitişik bir şekilde yerleştirilmelidir ve bir prosese
yeterli boyuttaki ilk boş alan atanmalıdır. Bir prosese alan tahsisi için, yeterli boyuttaki alanların en küçüğünü
aramayınız. Ayrıca, hafızadaki boş alanların birleştirilmesi gibi bir işlem yapılmayacaktır.
3. Ödevle birlikte örnek bir dosya sisteme yüklenecektir. Kendinizin de formata uygun farklı dosyalar oluşturup
uygulamanızı test etmenizde yarar vardır. Ayrıca, örnek bir dosyanın ekran görüntüsü aşağıda yer almaktadır.
4. Çalıştırılan her bir program için bir PCB (Process Control Block) yaratılmalıdır. (PCB’lerin RAM’de yer
kaplamadığı varsayılacaktır.) Her bir PCB’nin içermesi gereken bilgiler şunlardır:
- Proses numarası - pid (pozitif bir tamsayıdır ve eşsiz olmalıdır. Pid’ler 1000’den başlayarak
numaralandırılmalıdır.)
- Prosesin yaratılma zamanı (saniye olarak tutulmalıdır)
- Prosesin toplam büyüklüğü (KB cinsinden)
5. İşletim sisteminin kendisi de RAM’de 1000 KB büyüklükte yer kaplamalıdır.
6. RAM'de dolu olan ve boş olan yerler bir tabloda (veyahut uygun bir veri yapısında) tutulmalıdır. (Bu tablonun
(veyahut uygun bir veri yapısının) RAM’de yer kaplamadığı varsayılacaktır.) java dilinde bulunan hazır veri
yapılarını kullanabilirsiniz.
7. Bir proses sonlandığında, o proses için ayrılmış olan alan boşa çıkmalıdır ve o prosese ilişkin PCB de
silinmelidir.
8. Uygulamanız çalıştığında kullanıcıya RAM’in durumunu görmek istediği saniyeyi soracaktır. Kullanıcı saniyeyi
girdikten sonra, uygulama RAM’in o saniyedeki dolu olan kısımlarına ilişkin bilgileri ve PCB’si bulunan
prosesleri ekrana çıktı olarak verecektir. Daha sonra, uygulamanız kullanıcıya ilgili saniyedeki PCB’sini
görüntülemek istediği proses ismini soracaktır ve ismi girilen prosesin ilgili saniyedeki PCB bilgilerini ekrana
çıktı olarak verecektir. (Örnek bir ekran görüntüsü aşağıda verilmiştir. Sizin uygulamanızın da aynı formatta
ekrana çıktı üretmesi gerekmektedir. Formatı ve ekrandaki mesajların sırasını değiştirmeyiniz.
9. Projenizi yaparken nesneye yönelik programlama tekniğini göz önünde bulundurunuz. Dolayısıyla, projenizde
belirli sayıda ve uygun şekilde sınıflar ve metotlar tanımlanmalıdır.
Örnek bir ekran görüntüsü aşağıda verilmiştir:
girdi.txt dosyası okundu.
Lütfen RAM’in durumunu görmek istediğiniz saniyeyi giriniz.
20
20. Saniyede RAM’in dolu olan kısımları:
0. Ve 1023999. Adresler arasında işletim sistemi bulunmaktadır.
1024000. Ve 1385471. Adresler arasında A.exe programı bulunmaktadır.
1385472. Ve 1407999. Adresler arasında hesapla.exe programı bulunmaktadır.
1416192. Ve 1452031. Adresler arasında B.exe programı bulunmaktadır.
PCB’si bulunan Prosesler: A.exe B.exe hesapla.exe
20. saniyedeki PCB’sini görüntülemek istediğiniz proses ismini giriniz:
hesapla.exe
hesapla.exe isimli prosesin 20. Saniyedeki PCB bilgileri şu şekildedir:
Proses numarası: 1003
Prosesin yaratılma zamanı: 18. saniye
Prosesin toplam büyüklüğü: 22 KB


![İşletimSistemi](https://github.com/user-attachments/assets/e0b72dd0-adf2-4c81-b6c0-9602cc1bb29f)




