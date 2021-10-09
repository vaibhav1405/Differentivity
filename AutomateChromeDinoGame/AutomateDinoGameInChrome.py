import pyautogui # pip install pyautogui
from PIL import Image, ImageGrab # pip install pillow
import time

# This function simulate the pressing of key.
def hit(key):
    if key == 'down':
        pyautogui.keyDown(key)
        time.sleep(0.1)
        pyautogui.keyUp(key)
    else:
        pyautogui.keyDown(key)
        time.sleep (0.01)
        pyautogui.keyUp(key)
    return

# Funtion to press key when a obstacle caught in rectangel near dinaosour,In Light mode
def isCollideLight(data):
# Draw the rectangle for birds
    for i in range(300,600):
        for j in range(410, 590):
            if data[i, j] < 100:
                hit("down")
                return
# Draw the rectangle for cactus
    for i in range(300,600):
        for j in range(590, 700):
            if data[i, j] < 100:
                hit("up")
                return
# Funtion to press key when a obstacle caught in rectangel near dinaosour.In dark mode.
def isCollideDark(data):
# Draw the rectangle for birds
    for i in range(300,600):
        for j in range(410, 590):
            if data[i, j] > 100:
                hit("down")
                return
# Draw the rectangle for cactus
    for i in range(300,600):
        for j in range(590, 700):
            if data[i, j] > 100:
                hit("up")
                return
    
# Logic to change b/w light and dark mode.
def logic(data):
    for i in range(0,1920):
        for j in range(800,900):
            if data[i, j] > 100:
                print('Light')
                return "Light"
            elif data[i, j] <  100:
                print('Dark')
                return "Dark"
            else:
                print("No Mode") 

if __name__ == "__main__":
    print("Hey.. Dino game about to start in 2 seconds")
    time.sleep(2)

    # Game loop to make sure game plays continuously.
    while True:
        image = ImageGrab.grab().convert('L')  
        data = image.load()
        x=logic(data)
        if x == "Light":
            isCollideLight(data)
        elif x == "Dark":
            isCollideDark(data)
        else :
            print("Stoped unexpextedly.")
            break

        image1 = ImageGrab.grab().convert('L')
        data1 = image1.load()
        if image == image1:
            time.sleep(2)
            hit('space')
            time.sleep(0.6)
        else:
            continue