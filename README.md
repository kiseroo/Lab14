# Lab 14: Maven-д Суурилсан Java Төсөлд Git Workflow болон GitHub Actions Хэрэглэх
# B222270077 Г.Тэмүүлэн

Энэхүү репозитори нь Maven-д суурилсан Java төсөл дээр Git workflow, хамтын ажиллагаа, болон GitHub Actions ашиглан CI/CD процессыг хэрхэн хэрэгжүүлэхийг харуулна.


## Төслийн Зорилго
Git workflow-ийн ойлголтуудыг хэрэглэж, branch гаргахыг загварчлах. GitHub Actions ашиглан JUnit тест, Checkstyle-ийн кодын загварын шалгалт, болон JaCoCo-ийн 100% branch coverage-ийг автоматжуулсан Continuous Integration (CI) процесс хэрэгжүүлэх.

## Ашигласан Технологиуд
- **Java 17**
- **Maven**: Төслийн удирдлага
- **JUnit 5**: Тестлэлт
- **Checkstyle**: Кодын бичиглэлийн стандарт шалгах (Google Style)
- **JaCoCo**: Code coverage шалгах (100% branch coverage шаардлагатай)
- **GitHub Actions**: CI/CD автоматжуулалт

## Командууд

Төслийг локал орчинд ажиллуулах командууд:

- **Тест ажиллуулах**:
  ```bash
  mvn test
  ```

- **Кодын загвар (Checkstyle) шалгах**:
  ```bash
  mvn checkstyle:check
  ```

- **Code Coverage тайлан үүсгэх**:
  ```bash
  mvn jacoco:report
  ```
  Тайланг `target/site/jacoco/index.html` замаар нээж харах боломжтой.

- **Code Coverage шалгах (100% эсэхийг баталгаажуулах)**:
  ```bash
  mvn jacoco:check
  ```

## Салбарын Бүтэц (Branching Strategy)
- **main**: Тогтвортой, production-д бэлэн код. Шууд push хийхийг хориглосон.
- **develop**: Хөгжүүлэлтийн үндсэн салбар.
- **feature/*** (feature/add-multiplication, feature/add-division): Шинэ боломж хөгжүүлэх салбарууд.
- **release/*** (release/v1.0.0): Хувилбар гаргах бэлтгэл салбар.
- **hotfix/*** (hotfix/v1.0.1): Production дээрх алдааг яаралтай засах салбар.

![image alt](https://github.com/kiseroo/Lab14/blob/28f0d4d720a84274e6b4d23fc88adbf67e538fd0/screenshot11.PNG)

