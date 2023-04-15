/**
 * @param {number} millis
 */
async function sleep(millis) {
    const func = new Promise((resolve)=>{
        setTimeout(()=>{
            resolve()
        },millis)
    })

    return func;
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */