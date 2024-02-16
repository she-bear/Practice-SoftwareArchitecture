Patient {
	id integer pk increments
	full_name varchar
	birth date
	address varchar
	phone varchar
}

Med_insurance {
	id integer pk increments
	id_patient integer > Patient.id
	type binary
	number integer
	expire_to date
	company string
}

Insurance_company {
	id integer pk increments
	id_med_insurance integer > Med_insurance.id
	title varchar
	address varchar
	agent_phone varchar
}

Patient_Document {
	id integer pk increments
	id_patient integer > Patient.id
	type binary
	number varchar
	date_exp integer null
}

Med_card {
	id integer pk increments
	id_patient integer > Patient.id
	id_disease integer >* Diseases.id
	id_med_research integer >* Med_research.id
	id_med_record integer >* Med_record_entry.id
}

Diseases {
	id integer pk increments
	codeMKB integer
	description varchar
	comment varchar
}

Med_research {
	id integer pk increments
}

Doctor {
	id integer pk increments
	id_med_specility integer >* Medical_specialties.id
	full_name varchar
	phone varchar
}

Medical_specialties {
	id integer pk increments
	title varchar
}

Medical_license {
	id integer pk increments
	id_med_specialty integer > Medical_specialties.id
	organization varchar
	date_exp date
}

Appointment {
	id integer pk increments
	id_patient integer *>* Patient.id
	id_doctor integer *>* Doctor.id
	date_time datetime
	office integer
}

Med_record_entry {
	id integer pk increments
	id_patient integer > Patient.id
	id_doctor integer > Doctor.id
	id_app integer > Appointment.id
	comment varchar
}
