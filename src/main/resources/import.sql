--
-- JBoss, Home of Professional Open Source
-- Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

-- You can use this file to load seed data into the database using SQL statements

insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('329299', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 736)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('329199', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 512)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('165613', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 256)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('165614', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 54)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('165954', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 87)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('444434', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 443)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('444435', 'http://maps.google.com/?q=Raleigh', 'Raleigh', 600)
insert into PRODUCT_INVENTORY (itemId, link, location, quantity) values ('444436', 'http://maps.google.com/?q=Tokyo', 'Tokyo', 230)

insert into PRODUCT_CATALOG (itemId, name, description, price) values ('329299', 'Red Fedora', 'Official Red Hat Fedora', 34.99)
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('329199', 'Forge Laptop Sticker', 'JBoss Community Forge Project Sticker', 8.50)
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('165613', 'Solid Performance Polo', 'Moisture-wicking, antimicrobial 100% polyester design wicks for life of garment. No-curl, rib-knit collar; special collar band maintains crisp fold; three-button placket with dyed-to-match buttons; hemmed sleeves; even bottom with side vents; Import. Embroidery. Red Pepper.',17.80)
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('165614', 'Ogio Caliber Polo', 'Moisture-wicking 100% polyester. Rib-knit collar and cuffs; Ogio jacquard tape inside neck; bar-tacked three-button placket with Ogio dyed-to-match buttons; side vents; tagless; Ogio badge on left sleeve. Import. Embroidery. Black.', 28.75)
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('165954', '16 oz. Vortex Tumbler', 'Double-wall insulated, BPA-free, acrylic cup. Push-on lid with thumb-slide closure; for hot and cold beverages. Holds 16 oz. Hand wash only. Imprint. Clear.', 6.00)
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('444434', 'Pebble Smart Watch', 'Smart glasses and smart watches are perhaps two of the most exciting developments in recent years.', 24.00)
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('444435', 'Oculus Rift', 'The world of gaming has also undergone some very unique and compelling tech advances in recent years. Virtual reality, the concept of complete immersion into a digital universe through a special headset, has been the white whale of gaming and digital technology ever since Geekstakes Oculus Rift GiveawayNintendo marketed its Virtual Boy gaming system in 1995.Lytro',106.00 )
insert into PRODUCT_CATALOG (itemId, name, description, price) values ('444436', 'Lytro Camera', 'Consumers who want to up their photography game are looking at newfangled cameras like the Lytro Field camera, designed to take photos with infinite focus, so you can decide later exactly where you want the focus of each image to be.', 44.30)
