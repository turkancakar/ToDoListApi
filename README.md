# Yapılacaklar Listesi (To-Do List) API

Spring Boot ve PostgreSQL ile geliştirilmiş basit bir RESTful yapılacaklar listesi (To-Do List) uygulaması

## Özellikler
- Görev ekleme, güncelleme, silme ve listeleme
- PostgreSQL veritabanı entegrasyonu
- Temiz ve modüler kod yapısı

## Kullanılan Teknolojiler
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL


### Gereksinimler
- Java 17+
- Maven
- PostgreSQL

### Kurulum
1. **Projeyi klonlayın:**
   ```bash
   git clone https://github.com/turkancakar/ToDoListApi.git
   cd repo-adi
   ```
2. **Veritabanı ayarlarını yapın:**
   - `src/main/resources/application.properties` dosyasındaki PostgreSQL bilgilerinizi güncelleyin:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
     spring.datasource.username=postgres
     spring.datasource.password=sifreniz
     ```
3. **Veritabanını oluşturun:**
   - PostgreSQL'de `todolist` adında bir veritabanı oluşturun.

4. **Projeyi başlatın:**
   ```bash
   ./mvnw spring-boot:run
   ```
   veya
   ```bash
   mvn spring-boot:run
   ```


## Postman Örnekleri
- **GET:** `http://localhost:8080/api/tasks`
- **POST:** `http://localhost:8080/api/tasks` (Body: JSON)
- **PUT:** `http://localhost:8080/api/tasks/1` (Body: JSON)
- **DELETE:** `http://localhost:8080/api/tasks/1`

# ToDoListApi
