--### Solicitações ###
INSERT INTO request(id, cirurgia, consulta, data, exame, oficio, outros, solicitante, tid) VALUES (nextval('request_seq'), 'RASPAGEM TORNOZELO', '', to_date('21-10-2016', 'DD-MM-YYYY') ,'', '052/17', '','TONINHO VESPOLI - PSOL - LEGISLATIVO', 15718923);
INSERT INTO request(id, cirurgia, consulta, data, exame, oficio, outros, solicitante, tid) VALUES (nextval('request_seq'), 'HÉRNIA VENTRAL', '', to_date('10-10-2017', 'DD-MM-YYYY') ,'', '071/17', '','GEORGE HATO - PMDB - LEGISLATIVO', 45645645);

INSERT INTO USER_ACCESS(id, created, email, enabled, fullName, username, password, profile, updated) VALUES (nextval('user_access_seq'),current_timestamp, 'tsuleiman@prefeitura.sp.gov.br', '1', 'Tiago Suleiman','test', '9F86D081884C7D659A2FEAA0C55AD015A3BF4F1B2B0B822CD15D6C15B0F00A08', 'ADMIN', current_timestamp);
INSERT INTO USER_ACCESS(id, created, email, enabled, fullName, username, password, profile, updated) VALUES (nextval('user_access_seq'),current_timestamp, 'beatrizbotelho@prefeitura.sp.gov.br', '1', 'Beatriz Helena Falcão Botelho','admin', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', 'ADMIN', current_timestamp);
INSERT INTO USER_ACCESS(id, created, email, enabled, fullName, username, password, profile, updated) VALUES (nextval('user_access_seq'),current_timestamp, 'mtriguetti@prefeitura.sp.gov.br', '1', 'Marisa Toledo Riguetti','user', '04F8996DA763B7A969B1028EE3007569EAF3A635486DDAB211D512C85B9DF8FB', 'USER', current_timestamp);

--## PARLAMENTARES

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'DALTON SILVANO','LEGISLATIVO', 'DEM',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'DAVID SOARES','LEGISLATIVO', 'DEM',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'MILTON LEITE','LEGISLATIVO', 'DEM',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'SANDRA TADEU','LEGISLATIVO', 'DEM',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'FERNANDO HOLIDAY','LEGISLATIVO', 'DEM',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'JANAINA LIMA','LEGISLATIVO', 'NOVO',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ZÉ TURIN','LEGISLATIVO', 'PHS',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'GEORGE HATO','LEGISLATIVO', 'PMDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'RICARDO NUNES','LEGISLATIVO', 'PMDB',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'MILTON FERREIRA','LEGISLATIVO', 'PODE',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'CONTE LOPES','LEGISLATIVO', 'PP',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'SONINHA','LEGISLATIVO', 'PPS',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'PROF. CLAUDIO FONSECA','LEGISLATIVO', 'PPS',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'CELSO JATENE','LEGISLATIVO', 'PR',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'NOEMI NANATO','LEGISLATIVO', 'PR',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'TONINHO PAIVA','LEGISLATIVO', 'PR',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ISAC FELIX','LEGISLATIVO', 'PR',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ATILIO FRANCISCO','LEGISLATIVO', 'PRB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'SOUZA SANTOS','LEGISLATIVO', 'PRB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ANDRÉ SANTOS','LEGISLATIVO', 'PRB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'RINALDI DIGILIO','LEGISLATIVO', 'PRB',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'RICARDO TEIXEIRA','LEGISLATIVO', 'PROS',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'CAIO MIRANDA CARNEIRO','LEGISLATIVO', 'PSB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ELISEU GABRIEL','LEGISLATIVO', 'PSB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'OTA','LEGISLATIVO', 'PSB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'CAMILO CRISTÓFARO','LEGISLATIVO', 'PSB',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'GILBERTO NASCIMENTO','LEGISLATIVO', 'PSC',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'RUTE COSTA','LEGISLATIVO', 'PSD',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'EDIR SALES','LEGISLATIVO', 'PSD',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'JOSÉ POLICE NETO','LEGISLATIVO', 'PSD',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'RODRIGO GOULART','LEGISLATIVO', 'PSD',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'AURÉLIO NOMURA','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'CLAUDINHO DE SOUZA','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'EDUARDO TUMA','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'GILSON BARRETO','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'MARIO COVAS NETO','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'PATRICIA BEZERRA','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ADRIANA RAMALHO','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'FABIO RIVA','LEGISLATIVO', 'PSDB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'JOÃO JORGE','LEGISLATIVO', 'PSDB',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'SÂMIA BOMFIM','LEGISLATIVO', 'PSOL',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'TONINHO VESPOLI','LEGISLATIVO', 'PSOL',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ALFREDINHO','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ARSELINO TATTO','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ANTONIO DONATO','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'JAIR TATTO','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'JULIANA CARDOSO','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'REIS','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'SENIVAL MOURA','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ALESSANDRO GUEDES','LEGISLATIVO', 'PT',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'EDUARDO SUPLICY','LEGISLATIVO', 'PT',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ADILSON AMADEU','LEGISLATIVO', 'PTB',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'PAULO FRANGE','LEGISLATIVO', 'PTB',true);

INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'REGINALDO TRIPOLI','LEGISLATIVO', 'PV',true);
INSERT INTO PARLIAMENTARY(id, nome, solicitante, partido, enabled) VALUES (nextval('parliamentary_seq'), 'ABOU ANNI','LEGISLATIVO', 'PV',true);

--## PROCEDIMENTOS EXAMES

INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'CATETERISMO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'RESSONÃNCIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'ENDOSCOPIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TOMOGRAFIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'MAMOGRAFIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TC TORAX',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TC PELVE, BACIA E ABDOME SUP',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TC COLUNA C/CONSTRASTE',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TC COERÊNCIA OPTICA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TC CRANIO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'TC COLUNA CERVICAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'ECOCARDIOGRAMA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'USG ABDOMINAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'COLONOSCOPIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'USG CARÓTIDAS',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'HOLTER',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'USG ABDOMEN TOTAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'RM JOELHO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'ECOCARDIOGRAMA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'ANGIORESSONÂNCIA CEREBRAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'ELETROENCEFALOGRAMA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'CINTILOGRAFIA DA TIREOIDE',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'USG MAMA BILATERAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'USG MORFOLÓGICO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'POLISSONOGRAFIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'EXAME', 'ANGIOTOMOGRAFIA',true);

--## PROCEDIMENTOS CONSULTAS

INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'CLÍNICO GERAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'CIRURGIA GERAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'REUMATOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'ONCOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'OFTALMOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'NEUROLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'GINECOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'NEFROLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'ANGIOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'UROLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'ORTOPEDISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'CARDIOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'PNEULOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'PROCTOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'REUMATOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'ENDOCRINOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'DERMATOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'MASTOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'PSIQUIATRA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'HEMOTOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'OTORRINOLAGINGOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'FONOAUDIOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'COLOPROCTOLOGISTA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'PEDIATRA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'GERIATRA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CONSULTA', 'DENTISTA',true);

--## PROCEDIMENTOS CIRURGIAS

INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA GERAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA VASCULAR',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA PLÁSTICA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA OFTALMOLÓGICA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA GINECOLÓGICA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA ORTOPÉDICA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA CABEÇA E PESCOÇO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA COLOPROCTOLÓGICA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA CORAÇÃO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'MAMOPLASTIA REDUTORA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'RASPAGEM TORNOZELO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'HÉRNIA VENTRAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'HÉRNIA DISCO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CIRURGIA FÊMUR',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'IMPLANTAÇÃO PRÓTESE NO QUADRIL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'SEPTO NASAL',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CATETER DUPLO J',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CALCULO BILIAR',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'RETIRADA DE NÓDULO',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'LAQUEADURA TUBÁRIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'COLELITIASE',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'ARTROPLASTIA',true);
INSERT INTO SPECIALTY(id, procedimento, description, enabled) VALUES (nextval('specialty_seq'), 'CIRURGIA', 'CATARATA',true);


