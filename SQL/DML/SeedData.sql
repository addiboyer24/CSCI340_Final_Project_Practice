-- Insert data into CONSTELLATION table
INSERT INTO [csci340].[CONSTELLATION] ([Abbreviation], [Name], [Shape])
VALUES 
    ('AND', 'Andromeda', 'SPOON'),
    ('AQR', 'Aquarius', 'SPOON'),
    ('ARI', 'Aries', 'SPOON'),
    ('TAU', 'Taurus', 'SPOON'),
    ('LEO', 'Leo', 'SPOON'),
    ('LIB', 'Libra', 'SPOON'),
    ('GEM', 'Gemini', 'SPOON'),
    ('SCO', 'Scorpius', 'SPOON'),
    ('CNC', 'Cancer', 'SPOON'),
    ('CAP', 'Capricornius', 'SPOON'),
    ('PIS', 'Pisces', 'SPOON');
GO
-- Insert multiple data into STAR table
INSERT INTO [csci340].[STAR] ([CatalogNumber], [Name], [Mass], [Constellation])
VALUES
    ('S001', 'Sirius', 2000, 'AND'),
    ('S002', 'Canopus', 5000, 'AQR'),
    ('S003', 'Arcturus', 1800, 'ARI'),
    ('S004', 'Alpha Centauri', 1100, 'TAU'),
    ('S005', 'Vega', 700, 'LEO'),
    ('S006', 'Rigel', 2200, 'LIB'),
    ('S007', 'Proxima Centauri', 350, 'GEM'),
    ('S008', 'Betelgeuse', 3000, 'SCO'),
    ('S009', 'Antares', 2500, 'CNC'),
    ('S010', 'Spica', 1500, 'CAP'),
    ('S011', 'Pollux', 1200, 'PIS'),
    ('S012', 'Deneb', 3000, 'TAU'),
    ('S013', 'Altair', 800, 'LEO'),
    ('S014', 'Aldebaran', 2200, 'LIB'),
    ('S015', 'Castor', 900, 'GEM');
GO