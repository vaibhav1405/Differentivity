from selenium import webdriver
from selenium.webdriver.common import keys
from selenium.webdriver.common.keys import Keys
import time
import data
import random
driver = webdriver.Chrome()
driver.get(data.Url)
time.sleep(5)
for coursecode, subject in data.subjectsdatasem1.items():
    course = '{} {}'.format(coursecode, subject)
    emailInput = driver.find_element_by_xpath(data.Emailxpath)
    emailInput.send_keys(data.EmailAdress)
    time.sleep(1)
    stud_name = driver.find_element_by_xpath(data.Namexpath)
    stud_name.send_keys(data.Name)
    time.sleep(0.5)
    stud_name = driver.find_element_by_xpath(data.rollnumXpath)
    stud_name.send_keys(data.Rollno)
    time.sleep(0.5)
    stud_name = driver.find_element_by_xpath(data.currxpath)
    stud_name.send_keys(data.Currentsem1)
    time.sleep(0.5)
    selectprogram = driver.find_element_by_xpath(data.program)
    selectprogram.click()
    time.sleep(1)
    mca2sem = driver.find_element_by_xpath(data.mca2xpath)
    mca2sem.click()
    time.sleep(1)
    coursecode = driver.find_element_by_xpath(data.coursecode)
    coursecode.send_keys(course)
    time.sleep(1)
    
    question1 = driver.find_element_by_xpath(random.choice(data.question1))
    question1.click()
    time.sleep(1)

    question2 = driver.find_element_by_xpath(random.choice(data.question2))
    question2.click()
    time.sleep(1)

    question3 = driver.find_element_by_xpath(random.choice(data.question3))
    question3.click()
    time.sleep(1)

    question4 = driver.find_element_by_xpath(random.choice(data.question4))
    question4.click()
    time.sleep(1)

    question5 = driver.find_element_by_xpath(random.choice(data.question5))
    question5.click()
    time.sleep(1)

    question6 = driver.find_element_by_xpath(random.choice(data.question6))
    question6.click()
    time.sleep(1)

    question7 = driver.find_element_by_xpath(random.choice(data.question7))
    question7.click()
    time.sleep(1)

    question8 = driver.find_element_by_xpath(random.choice(data.question8))
    question8.click()
    time.sleep(1)

    question9 = driver.find_element_by_xpath(random.choice(data.question9))
    question9.click()
    time.sleep(1)

    question10 = driver.find_element_by_xpath(random.choice(data.question10))
    question10.click()
    time.sleep(1)

    question11 = driver.find_element_by_xpath(random.choice(data.question11))
    question11.click()
    time.sleep(1)
    submit = driver.find_element_by_xpath(data.submit)
    submit.click()
    time.sleep(3)
    driver.get(data.Url)
    time.sleep(7)



#! below code for 2 semester

for coursecode, subject in data.subjectsdatasem2.items():
    course = '{} {}'.format(coursecode, subject)
    emailInput = driver.find_element_by_xpath(data.Emailxpath)
    emailInput.send_keys(data.EmailAdress)
    time.sleep(0.5)
    stud_name = driver.find_element_by_xpath(data.Namexpath)
    stud_name.send_keys(data.Name)
    time.sleep(0.5)
    stud_name = driver.find_element_by_xpath(data.rollnumXpath)
    stud_name.send_keys(data.Rollno)
    time.sleep(0.5)
    stud_name = driver.find_element_by_xpath(data.currxpath)
    stud_name.send_keys(data.Currentsem2)
    time.sleep(0.5)
    selectprogram = driver.find_element_by_xpath(data.program)
    selectprogram.click()
    time.sleep(1)
    mca2sem = driver.find_element_by_xpath(data.mca2xpath)
    mca2sem.click()
    time.sleep(0.6)
    coursecode = driver.find_element_by_xpath(data.coursecode)
    coursecode.send_keys(course)
    time.sleep(0.6)
    
    question1 = driver.find_element_by_xpath(random.choice(data.question1))
    question1.click()
    time.sleep(0.6)

    question2 = driver.find_element_by_xpath(random.choice(data.question2))
    question2.click()
    time.sleep(0.5)

    question3 = driver.find_element_by_xpath(random.choice(data.question3))
    question3.click()
    time.sleep(0.5)

    question4 = driver.find_element_by_xpath(random.choice(data.question4))
    question4.click()
    time.sleep(0.5)

    question5 = driver.find_element_by_xpath(random.choice(data.question5))
    question5.click()
    time.sleep(0.5)

    question6 = driver.find_element_by_xpath(random.choice(data.question6))
    question6.click()
    time.sleep(0.5)

    question7 = driver.find_element_by_xpath(random.choice(data.question7))
    question7.click()
    time.sleep(0.5)

    question8 = driver.find_element_by_xpath(random.choice(data.question8))
    question8.click()
    time.sleep(0.5)

    question9 = driver.find_element_by_xpath(random.choice(data.question9))
    question9.click()
    time.sleep(0.5)

    question10 = driver.find_element_by_xpath(random.choice(data.question10))
    question10.click()
    time.sleep(0.5)

    question11 = driver.find_element_by_xpath(random.choice(data.question11))
    question11.click()
    time.sleep(0.5)
    submit = driver.find_element_by_xpath(data.submit)
    submit.click()
    time.sleep(3)
    driver.get(data.Url)
    time.sleep(5)
    
