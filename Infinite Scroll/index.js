// Unsplash API
const count = 5;
const apiKey = 'x4Feiz9G_tqlau7A4w9kaY2Vipexh74hXrriCBhr384';
let apiUrl = `https://api.unsplash.com/photos/random?
client_id=${apiKey}&count=${count}`;


// Get photos from Unsplash API
let photosArray = [] ;

// Check if all images hava loaded
let ready = false;
let imagesLoaded =  0;
let totalImages = 0;
async function getphotos() {
    try {
        const response = await fetch(apiUrl);
        photosArray = await response.json();
        displayPhotos();
        
    } catch (error) {
      
        console.log("Whoops error occured!",error);
    }     
}

getphotos();


// Deploy photos

const container = document.querySelector(".images");
const loader = document.querySelector(".loader");

// Image loaded function 
function imageLoaded() {
    imagesLoaded++
     if(imagesLoaded === totalImages) {
        ready = true;
        loader.hidden = true;
    }

}

// SetAttribute Function IMP!
function sAttr(element,attribute) {
    for(const key in attribute) {
        element.setAttribute(key,attribute[key])
    }
} 

// Display Photos
function displayPhotos() {
    imagesLoaded = 0
    totalImages = photosArray.length;
    photosArray.forEach((photo)=> {
        
        //Link to image
        const item = document.createElement('a');
        sAttr(item,{
            href:photo.links.html,
            target:'_blank',
        });


        // Create Image Element
        const img = document.createElement('img');
        sAttr(img,{
            src:photo.urls.regular,
            alt:photo.alt_description,
            title:photo.alt_description
        });
        
        // Image load
        img.addEventListener('load',imageLoaded)

        // Put Image element to Image container
        item.appendChild(img);
        container.appendChild(item);
    });
}


   window.addEventListener('scroll', () => {
    if(window.innerHeight+window.scrollY >= document.body.offsetHeight-1000 && ready) {
        ready = false;
        getphotos();
    }
    })



