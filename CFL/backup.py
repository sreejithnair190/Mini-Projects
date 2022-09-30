import mysql.connector as m

db= 'testdb02'

connection = m.connect(
    host="localhost",
    user="root",
    passwd="root",
    database = db
)

cursor = connection.cursor()

cursor.execute('SHOW TABLES;')

table_names = []

for record in cursor.fetchall():
    table_names.append(record[0])

backup_dbname = db+'_backup1'

try:
    cursor.execute(f'CREATE DATABASE {backup_dbname}')
except:
    pass

cursor.execute(f'USE {backup_dbname}')

for table_name in table_names:
    cursor.execute(f'CREATE TABLE {table_name} SELECT * from {db}.{table_name}')