use gym;
[892, 984]
create table Cliente(
	id_cliente varchar(10), 
	nombre varchar(50),
	apellidos varchar(50),
	direccion varchar(90),
	email varchar(60),
	fechaNacimiento varchar(15),
	sexo int,
	telefono varchar(15),
	fechaInscripcion varchar(15),
	constraint pkCliente primary key(id_cliente)
 );
 
 create table SaludCliente(
	lesion_osea int,
	desc_lesion_osea varchar(80),
	lesion_muscular int,
	desc_lesion_muscular varchar(80),
	enfermedad_cardiovascular int,
	desc_enfermedad_cardiovascular varchar(80),
	asfixia_por_ejercicio int,
	asmatico int,
	hipertenso int,
	diabetico int,
	fumador int,
	epileptico int,
	embarazo int,
	anemia int,
	mareos int,
	desmayo int,
	nauseas int,
	dificul_respirar int,
	pract_act_deportiva int,
	estuvo_otro_gym int,
	otro_padecimiento varchar(50),
	cliente varchar(10),
	constraint pkSaludCliente primary key(cliente)
 );
 
 create table Seguimiento(
	peso float,
	fecha varchar(40),
	imc float,
	grasa  float,
	pecho  float,
	espalda float,
	cadera  float,
	gluteos  float,
	cintura  float,
	pierna_izquierda  float,
	pierna_derecha  float,
	pantorrilla_izquierda  float,
	pantorrilla_derecha  float,
	brazo_izquierdo  float,
	brazo_derecho  float,
	antebrazo_derecho  float,
	antebrazo_izquierdo  float,
	cliente varchar(10),
	seg_id int auto_increment,
	constraint pkSeguimiento primary key(seg_id),
	constraint fkSeguimiento foreign key(cliente) references Cliente(id_cliente)
	ON DELETE CASCADE
);

create table Rutina(
	id int auto_increment,
	tipo_rutina int,
	nombre varchar(90),
	constraint pkRutina primary key(id)
);

create table EjerciciosRutina(
	id int auto_increment,
	parteCuerpo varchar(20),
	ejercicio varchar(40),
	serie varchar(5),
	repeticion varchar(5),
	peso varchar(5),
	rutina int,
	constraint pkEjerciciosRutina primary key(id),
	constraint fkEjerciciosRutina foreign key(rutina) references Rutina(id)
	ON DELETE CASCADE
);

create table ClienteRutina(
	cliente varchar(10),
	rutina int
);

create table Pago(
	id int auto_increment,
	fecha varchar(20),
	monto float,
	detalle varchar(30),
	cliente varchar(10),
	constraint PkPago primary key(id),
	constraint fkPago foreign key(cliente) references Cliente(id_cliente)
	ON DELETE CASCADE
);

create table Nutricion(
	id int auto_increment,
	nombre_plan varchar(100),
	cliente varchar(10),
	constraint PkNutricion primary key(id),
	constraint fkNutricion foreign key(cliente) references Cliente(id_cliente)
	ON DELETE CASCADE
);

create table Administradores(
userid varchar(20),
pass varchar(20),
	constraint PkAdministradores primary key(userid)
);

insert into Administradores(userid,pass) values("admin","admin");

--no se necesita una llave primaria: primary key(cliente, rutina)
--el ormlite busca todos los registros y si ya existen ambos los 2 iguales no los inserta

-- create table Nutricion(
-- id int auto_increment,
-- nombre varchar(40),
-- peso long,
-- altura int,
-- calorias long,
-- proteinas long,
-- grasas long,
-- constraint PkNutricion primary key(id),
-- constraint fkNutricion foreign key(cliente) references Cliente(id_cliente)
-- ON DELETE CASCADE
-- );

-- create table Cliente_Nutricion(
-- cliente varchar(10),
-- nutricion int,
-- constraint PkCliente_Nutricion primary key(cliente, nutricion),
-- constraint fkCliente_Nutricion foreign key(cliente) references Cliente,
-- constraint fkCliente_Nutricion2 foreign key(nutricion) references Nutricion,
-- );



drop table Seguimiento;
drop table SaludCliente;
drop table Pago;
drop table EjerciciosRutina;
drop table Rutina;
drop table Nutricion;
drop table ClienteRutina;
drop table Cliente;


select * from EjerciciosRutina;

 insert into Cliente(id_cliente, nombre, apellidos, direccion, email,
 fechaNacimiento, sexo, telefono, fechaInscripcion)
 values('401230641', 'rita', 'gonzalez', 'los angeles heredia', 'pablogonzaca@hotmail.com', '20/07/1992', 1, 
 '86903212', '30/1/2015');
 
 insert into Seguimiento(peso, fecha, imc, grasa, pecho,
espalda, cadera, gluteos, cintura, pierna_izquierda,
pierna_derecha, pantorrilla_izquierda, pantorrilla_derecha,
brazo_izquierdo, brazo_derecho, antebrazo_derecho, antebrazo_izquierdo, cliente) 
values(59.3, '27/02/2015', 12.0, 12.0, 45.8,
55.8, 55, 60, 51, 36,
36, 30, 30,
39, 39, 31, 31, '402150641');

ALTER TABLE Cliente MODIFY nacimiento varchar(20);
ALTER TABLE Cliente CHANGE nacimiento fechaNacimiento varchar(20);

 