const video = document.querySelector("#video");

const button = document.querySelector("button");


// Prompt  
async function selectMediaStream() {
    try {
        const mediaStream = await navigator.mediaDevices.getDisplayMedia();
        video.srcObject = mediaStream;
        videso.onloadedmetada = () => {
            video.play();
        }
    } catch (error) {
        console.log("Whhops! error occured.",error);
    }
}

button.addEventListener('click',async () => {
    // Disable Buton
    button.disabled = true;
    // Start picture in picture
    await video.requestPictureInPicture();
    // reset button
    button.disabled = false;
});
// Onload 
selectMediaStream();