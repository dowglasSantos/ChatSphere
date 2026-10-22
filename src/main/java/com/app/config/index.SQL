// Tabela de usuarios
CREATE TABLE tb_user (
   id BIGSERIAL PRIMARY KEY,
   username VARCHAR(30) NOT NULL UNIQUE,
   email VARCHAR(255) NOT NULL UNIQUE,
   password_hash VARCHAR(255) NOT NULL,
   created_at TIMESTAMP NOT NULL,
   updated_at TIMESTAMP NOT NULL
);

// Tabela de perfil de usuario
CREATE TABLE profiles (
  id BIGSERIAL PRIMARY KEY,
  user_id BIGINT NOT NULL UNIQUE,
  display_name VARCHAR(100),
  bio VARCHAR(500),
  avatar_url VARCHAR(255),

  CONSTRAINT fk_profile_user FOREIGN KEY (user_id) REFERENCES users(id)
);