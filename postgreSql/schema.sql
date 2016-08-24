drop table if exists datatoydb.movie cascade;
CREATE TABLE datatoydb.movie
(
  id integer NOT NULL,
  name character varying NOT NULL,
  description character varying NOT NULL,
  created timestamp with time zone NOT NULL DEFAULT now(),
  CONSTRAINT movie_pk PRIMARY KEY (id)
)
WITH (
OIDS=FALSE
);