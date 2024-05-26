
INSERT INTO address (id, address_line1, address_line2, city, postal_code)
VALUES
    (1, 'Ulica Główna', '1A', 'Warszawa', '62-030'),
    (2, 'Ulica Piekna', '2B', 'Kraków', '30-062'),
    (3, 'Ulica Nowa', '3C', 'Gdańsk', '80-001'),
    (4, 'Ulica Krótka', '4D', 'Poznań', '61-001'),
    (5, 'Ulica Długa', '5E', 'Łódź', '90-001');

INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
VALUES
    (1, 'Jan', 'Kowalski', '555-1234', 'jan.kowalski@szpitalek.com', 'DOC123', 'Kardiologia', 1),
    (2, 'Anna', 'Nowak', '555-5678', 'anna.nowak@szpitalek.com', 'DOC124', 'Dermatologia', 2),
    (3, 'Piotr', 'Wiśniewski', '555-8765', 'piotr.wisniewski@szpitalek.com', 'DOC125', 'Neurologia', 3),
    (4, 'Marek', 'Zieliński', '555-6543', 'marek.zielinski@szpitalek.com', 'DOC126', 'Onkologia', 4),
    (5, 'Ewa', 'Kamińska', '555-4321', 'ewa.kaminska@szpitalek.com', 'DOC127', 'Rehabilitacja', 5);

INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, age)
VALUES
    (1, 'Marta', 'Zielińska', '555-4321', 'marta.zielinska@szpitalek.com', 'PAT123', '1985-03-15', 39),
    (2, 'Krzysztof', 'Krawczyk', '555-6543', 'krzysztof.krawczyk@szpitalek.com', 'PAT124', '1990-07-22', 33),
    (3, 'Zofia', 'Kwiatkowska', '555-5678', 'zofia.kwiatkowska@szpitalek.com', 'PAT125', '1980-01-01', 44),
    (4, 'Adam', 'Wiśniewski', '555-9988', 'adam.wisniewski@szpitalek.com', 'PAT126', '1975-06-30', 48),
    (5, 'Ewa', 'Nowakowska', '555-1122', 'ewa.nowakowska@szpitalek.com', 'PAT127', '2000-05-10', 24),
    (6, 'Jan', 'Kowalski', '555-1234', 'jan.kowalski@szpitalek.com', 'PAC001', '1985-05-15', 39),
    (7, 'Anna', 'Nowak', '555-5678', 'anna.nowak@szpitalek.com', 'PAC002', '1990-03-10', 34),
    (8, 'Piotr', 'Zieliński', '555-9012', 'piotr.zielinski@szpitalek.com', 'PAC003', '1978-07-22', 46),
    (9, 'Tomasz', 'Wiśniewski', '555-3456', 'tomasz.wisniewski@szpitalek.com', 'PAC004', '1987-02-14', 37),
    (10, 'Katarzyna', 'Lewandowska', '555-7890', 'katarzyna.lewandowska@szpitalek.com', 'PAC005', '1995-11-25', 28);

INSERT INTO medical_treatment (id, description, type, patient_id)
VALUES
    (1, 'Chemioterapia', 'Onkologia', 1),
    (2, 'Fizjoterapia', 'Rehabilitacja', 2),
    (3, 'Operacja serca', 'Kardiologia', 3),
    (4, 'Leczenie dermatologiczne', 'Dermatologia', 4),
    (5, 'Terapia neurologiczna', 'Neurologia', 5),
    (6, 'Radioterapia', 'Onkologia', 6),
    (7, 'Terapia manualna', 'Rehabilitacja', 7),
    (8, 'Konsultacja kardiologiczna', 'Kardiologia', 8),
    (9, 'Zabieg dermatologiczny', 'Dermatologia', 9),
    (10, 'Terapia farmakologiczna', 'Neurologia', 10);

INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES
    (1, 'Wizyta kontrolna', '2024-05-20T10:00:00', 1, 1),
    (2, 'Kolejna wizyta', '2024-06-15T11:00:00', 2, 2),
    (3, 'Pierwsza konsultacja', '2024-07-10T09:30:00', 3, 3),
    (4, 'Sesja terapeutyczna', '2024-08-20T14:00:00', 1, 4),
    (5, 'Rutynowe badanie wzroku', '2024-09-05T15:00:00', 2, 5),
    (6, 'Roczny przegląd', '2024-05-21T08:00:00', 1, 2),
    (7, 'Konsultacja dermatologiczna', '2024-06-18T13:45:00', 2, 4),
    (8, 'Kontrola pediatryczna', '2024-07-25T10:00:00', 3, 5),
    (9, 'Badanie neurologiczne', '2024-08-15T11:30:00', 1, 1),
    (10, 'Kontrola kardiologiczna', '2024-09-10T09:00:00', 1, 3),
    (11, 'Wizyta u dermatologa', '2024-10-05T12:00:00', 2, 3),
    (12, 'Konsultacja neurologiczna', '2024-11-20T14:30:00', 3, 2),
    (13, 'Badanie kontrolne', '2024-12-01T09:15:00', 1, 4),
    (14, 'Terapia fizjoterapeutyczna', '2024-12-15T10:45:00', 2, 5),
    (15, 'Wizyta domowa', '2024-12-20T16:00:00', 3, 1),
    (16, 'Kontrola stanu zdrowia', '2024-06-10T11:00:00', 4, 6),
    (17, 'Wizyta kontrolna', '2024-07-15T10:30:00', 5, 7),
    (18, 'Konsultacja', '2024-08-05T12:45:00', 3, 8),
    (19, 'Terapia dermatologiczna', '2024-09-25T13:15:00', 4, 9),
    (20, 'Wizyta kontrolna', '2024-10-30T14:00:00', 1, 10),
    (21, 'Wizyta kontrolna', '2024-06-01T10:00:00', 1, 1),
    (22, 'Wizyta kontrolna', '2024-07-01T10:00:00', 1, 1),
    (23, 'Wizyta kontrolna', '2024-08-01T10:00:00', 1, 1),
    (24, 'Wizyta kontrolna', '2024-09-01T10:00:00', 1, 1),
    (25, 'Wizyta kontrolna', '2024-10-01T10:00:00', 1, 1);
