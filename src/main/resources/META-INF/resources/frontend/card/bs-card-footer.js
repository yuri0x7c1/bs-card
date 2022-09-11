
import { LitElement, html } from 'lit-element';
import { BsCardFooterCss } from './bs-card-footer.css.js';
import { BsContentRebootCss } from './content/bs-content-reboot.css.js';

export class BsCardFooter extends LitElement {

    static get styles() {
        return [
            BsContentRebootCss,
            BsCardFooterCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-footer"))
    window.customElements.define('bs-card-footer', BsCardFooter);
